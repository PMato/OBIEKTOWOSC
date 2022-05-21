public class Triangle extends Shape {
    public double area;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        super(a, b, c);

        if (this.isEquilateral()) this.name = "Trojkat rownoboczny";
        else if (this.isEquilibrium()) this.name = "Trojkat rownoramienny";
        else this.name = "Trojkat";
        this.setArea();
    }

    public boolean isEquilateral() {
        return (this.a == this.b) && (this.a == this.c);
    }

    public boolean isEquilibrium() {
        return (this.a == this.b || this.a == this.c || this.c == this.b);
    }

    public void setArea() {

        float perimeter = (((float) this.a + (float) this.b + (float) this.c) / 2);
        this.area = Math.sqrt(perimeter * (perimeter - this.a) * (perimeter - this.b) * (perimeter - this.c));
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(super.toString())
                .append(" OBW ")
                .append(circuit)
                .append(" Pole ")
                .append(this.area);
        return sb.toString();
    }
}