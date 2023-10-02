package ra.bt4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle("red",3,4);
        rectangle.getArea();
        rectangle.display();

        Shape circle = new Circle("blue",4);
        circle.getArea();
        circle.display();
    }
}
