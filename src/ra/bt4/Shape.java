package ra.bt4;

public abstract class Shape {
    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void getArea();
    public void display(){
        System.out.println("Màu sắc: " + getColor());
    }
}
