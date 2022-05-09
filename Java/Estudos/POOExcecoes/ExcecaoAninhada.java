package Java.Estudos.POOExcecoes;

public class ExcecaoAninhada {
    
    public static void main(String args[]) {
        int num[] = {4, 8, 16, 32, 64, 128, 256, 512};
        int den[] = {2, 0, 4, 4, 0, 8};

        try { //bloco externo
            for(int i = 0; i < num.length; i++) {
                try { //bloco interno
                    System.out.println(num[i]+" / "+den[i]+" = "+num[i]/den[i]);
                } catch(ArithmeticException ae) {
                        System.out.println("Não existe divisão por zero");
                }
            }
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("Posição do vetor incorreta");
            System.out.println("Programa será finalizado");
        }
    }

}
