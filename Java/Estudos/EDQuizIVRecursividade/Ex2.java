package Java.Estudos.EDQuizIVRecursividade;

public class Ex2 {
    
    public static void main(String[] args) {
        
        int x;
        x = funcao(30,21);
        System.out.println(x);

    }

    private static int funcao(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return funcao(b, a % b);
        }
    }

}
