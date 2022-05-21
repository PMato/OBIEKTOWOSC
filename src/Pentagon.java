public class Pentagon extends Shape {
    public int d, e;

    public Pentagon() {

    }

    public Pentagon(int a, int b, int c, int d, int e) {
        super(a, b, c);
        this.e = e;
        this.d = d;
        this.name = "Pieciokat";
        this.setArea();
        this.circuit += (this.d + this.e);

    }

    public String setArea() {

        if (this.a == this.b) {
            this.name = "Pieciokat Foremny";
            return this.area = String.valueOf((Math.sqrt(5 * (5 + 2 * (Math.sqrt(5)))) * this.a * this.a) / 4);
        }
        return this.area = "BRAK";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" ")
                .append(d)
                .append(" ")
                .append(e)
                .append(" OBW ")
                .append(circuit)
                .append(" POLE ")
                .append(area);
        return sb.toString();
    }
}
