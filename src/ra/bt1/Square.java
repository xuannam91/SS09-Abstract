package ra.bt1;

public class Square implements Resizeable{
    private double canh;
    private double dientich;

    public Square() {
    }

    public Square(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getDientich() {
        return dientich;
    }

    public void setDientich(double dientich) {
        this.dientich = dientich;
    }

    @Override
    public void resize(double percent) {
        double newCanh = getCanh() + (percent / 100) * getCanh();
        setCanh(newCanh);
        System.out.println("Kích thước đã thay đổi thành " + newCanh);
    }

    @Override
    public void dientich() {
        System.out.println(this.dientich = this.getCanh()*this.getCanh());

    }
}
