public class Circle extends Shape{


    public Circle() {
    }

    public Circle(int a) {
        this.a = a;
        this.setArea();
        this.name = "Koło";
        this.circuit = 2 * this.a * Math.PI;

    }
    public void setArea(){
        this.area = String.valueOf((this.a * this.a) * Math.PI);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name)
                .append(" ")
                .append(this.a)
                .append(" OBW ")
                .append(this.circuit)
                .append(" Pole ")
                .append(this.area);
        return sb.toString();
    }
}
