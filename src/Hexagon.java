public class Hexagon extends Shape {
    public int d, e, f;

    public Hexagon() {
    }

    public Hexagon(int a, int b, int c, int d, int e, int f) {
        super(a, b, c);
        this.d = d;
        this.e = e;
        this.f = f;
        this.name = "Szesciokat";
        this.setArea();
        this.circuit += (this.d + this.e + this.f);

    }

    public String setArea() {

        if (this.a == this.b) {
            this.name = "Szesciokat Foremny";
            return this.area = String.valueOf((6 * (this.a * this.a)) / (4 * Math.tan(Math.PI / 6)));
        }
        return this.area = "BRAK";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append(" ")
                .append(d)
                .append(" ")
                .append(e)
                .append(" ")
                .append(f)
                .append(" OBW ")
                .append(circuit)
                .append(" POLE ")
                .append(area);
        return sb.toString();
    }
}
