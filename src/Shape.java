public class Shape {
    public int a, b, c;
    public String name;
    public String area = "brak";
    public double circuit;

    public Shape() {
    }

    public Shape(int a) {
        this.a = a;
    }

    public Shape(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.name = "figura";
        this.circuit = this.a + this.b + this.c;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name)
                .append(" ")
                .append(a)
                .append(" ")
                .append(b)
                .append(" ")
                .append(c);
        return sb.toString();
    }

}

