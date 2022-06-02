package Java.Estudos.Quiz3POO;

public class Arvore {
    
    public static void main(String[] args) {
        String s = "0";
        Boat b = new Boat();
        Boat b2 = new SpeedBoat();
        SpeedBoat s2 = new SpeedBoat();

        if((b instanceof Vessel) && (b2 instanceof Toy)) {
            s += "1";
        }

        if((s2 instanceof Vessel) && (s2 instanceof Toy)) {
            s += "2";
        }
        System.out.println(s);


    }

}
