package ra.bt2;

public class Square implements Colorable {
    private double canh;
    private boolean Colorable;

    public Square() {
    }

    public Square(double canh, boolean colorable) {
        this.canh = canh;
        Colorable = colorable;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public boolean isColorable() {
        return Colorable;
    }

    public void setColorable(boolean colorable) {
        Colorable = colorable;
    }

    public double dientich(){
        return canh * canh;
    }
    public void display(){
        System.out.println("dien tich hinh vuong la " + dientich());
    }
    @Override
    public void howToColor() {
        System.out.println("Tô màu tất cả cách cạnh");
    }
}
