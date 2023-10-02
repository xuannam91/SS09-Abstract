package ra.bt1;

public class Circle implements Resizeable{
    private double radius;
    private final double FI = 3.14;
    private double dientich;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    @Override
    public void resize(double percent) {
        double newRadius = getRadius() + (percent / 100) * getRadius();
        setRadius(newRadius);
        System.out.println("Kích thước đã thay đổi thành " + newRadius);
    }

    @Override
    public void dientich() {
        System.out.println(this.dientich = this.getRadius()*this.getRadius()*FI);
    }


}
