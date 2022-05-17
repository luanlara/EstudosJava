package Java.Estudos.EDRecursividade;

public class Fatorial {
    
    public static void main(String[] args) {
        
        int x = fatorialRecursivo(5);
        System.out.println(x);

        int y = fatorial(5);
        System.out.println(y);

    }

    public static int fatorialRecursivo(int n) {
        if (n == 0) {  //caso base
            return 1;
        } else {
            return n * fatorialRecursivo(n - 1);   //caso recursivo
        }
    }

    public static int fatorial(int n) {
        int fat = 1;
        while (n >= 1) {
            fat = fat * n;
            n--;
        }
        return fat;
    }

}
