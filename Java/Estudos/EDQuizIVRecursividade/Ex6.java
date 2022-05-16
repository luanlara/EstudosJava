package Java.Estudos.EDQuizIVRecursividade;

public class Ex6 {
    
    public static void main(String[] args) {
        
        int x = f(4);
        System.out.println(x);

    }

    private static int f(int x) {
        if (x == 1) {
            return -x;
        } else {
            return -5 * f(x-1) + x;
        }
    }

}
