package Java.Estudos.Quiz3POO;

public class Espelho {
    int tamanho = 7;

    public static void main(String[] args) {
            
        Espelho e1 = new Espelho();
        Espelho e2 = e1;
        int i1 = 10;
        int i2 = i1;

        fazerAlgo(e2, i2);
        System.out.println(e1.tamanho + " " + i1);

    }

    static void fazerAlgo(Espelho e, int i) {
        e.tamanho = 8;
        i = 12;
    }

}
