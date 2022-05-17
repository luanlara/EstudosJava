package Java.Estudos.EDRecursividade;

public class Arrays {
    
    public static void main(String[] args) {
        
        int[] x = new int[4];
        x[0] = 2;
        x[1] = 4;
        x[2] = 6;
        x[3] = 8;

        int y = somaVetor(x, 4);
        System.out.println(y);
    }

    private static int somaVetor(int[] x, int n) {
        if (n == 1) {
            return x[0];
        } else {
            return x[n-1] + somaVetor(x, n - 1);
        }
    }

}
