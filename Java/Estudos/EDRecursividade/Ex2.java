package Java.Estudos.EDRecursividade;

public class Ex2 {
    
    public static void main(String[] args) {
        
        int x = f(5, 4);
        System.out.println(x);
    }

    public static int f(int x, int n) {
        if (n == 1) {
            return 1;
        } else {
            return x * f(x, n - 1);
        }
    }

}
