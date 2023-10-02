package ra.bt1;

public class Main {
    public static void main(String[] args) {
        Resizeable[] resizeable = new Resizeable[3];
        resizeable[0] = new Circle(3);
        resizeable[1] = new Rectangle(3, 4);
        resizeable[2] = new Square(5);
        for (Resizeable elemnent: resizeable){
            System.out.println("diện tich trước");
            elemnent.dientich();
            elemnent.resize(50);
            System.out.println("diện tich sau");
            elemnent.dientich();
        }
    }
}
