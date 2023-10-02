package ra.bt4;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }



    public double getHeight() {
        return height;
    }



    @Override
    public void getArea() {
        System.out.println("diện tích hình chữ nhật: " + getWidth() * getHeight());
    }

}
