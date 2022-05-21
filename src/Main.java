import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj dlugosci bokow oddzielone spacja");
        Shape[] shapes = new Shape[5];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < shapes.length; i++) {
            String[] tab = scanner.nextLine().split(" ");
            int[] tabInt = new int[tab.length];
            int sum = 0;
            int max = 0;
            for (int j = 0; j < tab.length; j++) {
                tabInt[j] = parseInt(tab[j]);
                sum += tabInt[j];
                max = Math.max(tabInt[j], max);
            }

            switch (tabInt.length) {
                case 1:

                    shapes[i] = new Circle(tabInt[0]);
                    break;
                case 3:

                    if (max < sum - max) shapes[i] = new Triangle(tabInt[0], tabInt[1], tabInt[2]);
                    else {
                        System.out.println("nie da sie utworzyc takiego trojkata");
                        i--;
                    }
                    break;
                case 4:

                    if (max < sum - max) shapes[i] = new Quadrangle(tabInt[0], tabInt[1], tabInt[2], tabInt[3]);
                    else {
                        System.out.println("nie da sie utworzyc takiego czworokata");
                        i--;
                    }
                    break;
                case 5:
                    if (max < sum - max)
                        shapes[i] = new Pentagon(tabInt[0], tabInt[1], tabInt[2], tabInt[3], tabInt[4]);
                    else {
                        System.out.println("nie da sie utworzyc takiego pieciokata");
                        i--;
                    }
                    break;
                case 6:
                    if (max < sum - max)
                        shapes[i] = new Hexagon(tabInt[0], tabInt[1], tabInt[2], tabInt[3], tabInt[4], tabInt[5]);
                    else {
                        System.out.println("nie da sie utworzyc takiego szesciokata");
                        i--;
                    }
                    break;
                default:
                    System.out.println("nie da sie utworzyc takiej figury");
                    i--;
                    break;
            }
        }

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
