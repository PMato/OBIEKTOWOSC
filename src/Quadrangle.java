public class Quadrangle extends Shape {
    public int d;


    public Quadrangle() {
    }


    public Quadrangle(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;

        if (this.isSquare()) this.name = "Kwadrat";
        else if (this.isRectangle()) this.name = "Prostokat";
        else this.name = "Czworokat";
        this.setArea();
        this.circuit += this.d;


    }

    public boolean isSquare() {
        return (this.a == this.b && this.c == this.d && this.b == this.d);
    }

    public boolean isRectangle() {
        return (this.a == this.c && this.b == this.d);
    }

    public String setArea() {

        if (this.isRectangle()) {

            return this.area = String.valueOf(this.a * this.b);
        }
        return this.area = "BRAK";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" ")
                .append(d)
                .append(" OBW ")
                .append(circuit)
                .append(" pole ")
                .append(this.area);

        return sb.toString();
    }
}
