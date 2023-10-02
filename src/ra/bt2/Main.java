package ra.bt2;

public class Main {
    public static void main(String[] args) {
        Square[] squares = new Square[3];
        squares[0] = new Square(4,true);
        squares[1] = new Square(2,false);
        squares[2] = new Square(5,true);
        for (Square item: squares){
            if(item.isColorable()){
                item.display();
                item.howToColor();
            }
        }


    }
}
