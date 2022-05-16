package Java.Estudos.EDQuizIVRecursividade;

public class Ex1 {
    
    public static void main(String[] args) {
        
        int x;
        x = meuMetodo(3) + meuMetodo(7);
        System.out.println(x);

    }

    private static int meuMetodo(int n) {
        if(n < 4) {
            return 3*n;
        } else {
            return 2*meuMetodo(n - 4) + 5;
        }
    }

}
