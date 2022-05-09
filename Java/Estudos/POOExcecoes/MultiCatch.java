package Java.Estudos.POOExcecoes;

public class MultiCatch {
    
    public static void main(String[] args) {
        int a = 88, b = 0, resultado;
        char ch[] = {'A', 'B', 'C'};
        
        for(int i = 0; i < ch.length; i++) {
            try {
                if(i == 0) resultado = a / b;
                else ch[5] = 'X';
            } catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {  //As duas exceções serão tratadas ao mesmo tempo
                System.out.println("Exceção: " + e);
            }
        }
    }

}
