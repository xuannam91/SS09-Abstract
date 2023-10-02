package ra.bt1;

public class Rectangle implements Resizeable{
    private double width;
    private double height;
    private double dientich;


    public Rectangle() {
    }

    public Rectangle(double width, double height ) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    @Override
    public void resize(double percent) {
        double newWidth = getWidth() + (percent / 100) * getWidth();
        setWidth(newWidth);
        System.out.println("Kích thước đã thay đổi thành " + newWidth);

        double newHeight = getHeight() + (percent / 100) * getHeight();
        setHeight(newHeight);
        System.out.println("Kích thước đã thay đổi thành " + newHeight);


    }

    @Override
    public void dientich() {
        System.out.println(this.dientich = this.getWidth()*this.getHeight());

    }
}
