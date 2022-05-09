package Java.Estudos.POOExcecoes;

public class Excecao {
    
    public static void main(String[] args) {
        
        int a = 4;
        int b = 0;
        int div;
        int[] c = new int[4];

        // Exemplo: divisão por zero
        try {
            div = a / b;
            System.out.println("A divisão é: " + div);
            //c[4] = 10;
        } catch (ArithmeticException e) {
            System.err.println("Não existe divisão por zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Índice fora do intervalo do array.");
        } finally {
            System.out.println("Operação OK ou exceção tratada.");
        }
        

    }

}
