package Java.Estudos.Quiz3POO;

public class Laser2 {
    
    public static void main(String[] args) {
        
        Box b1 = new Box(5);
        Box[] ba = go(b1, new Box(6));
        ba[0] = b1;

        for (Box b : ba) {
            System.out.print(b.size + " ");
        }

    }

    public static Box[] go(Box b1, Box b2) {
        b1.size = 4;
        Box[] ma = {b2, b1};
        return ma;
    }

}
