package Java.Estudos.IniciaisPOO;

import java.util.Random;

public class ArraysMultid {
    
    public static void main(String[] args) {
        Random gerador = new Random();
        int[][] x = new int[5][5];

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                x[i][j] = gerador.nextInt(101);
            }
        }

        for(int i = 0; i < x.length; i++) {
            for(int j = 0; j < x[i].length; j++) {
                //System.out.println(x[i][j] + "\t");
            }
        }

        //lista de argumento de comprimento variável
        System.out.printf("%.2f\n", media(2.5, 3.0));
        System.out.printf("%.2f\n", media(2.2, 3.3, 4.1, 5.05));
    }
        
    public static double media(double... x) {
        double total = 0;
        for(double i : x ) {
        total += i;
    }
        return total / x.length;
    }
}


