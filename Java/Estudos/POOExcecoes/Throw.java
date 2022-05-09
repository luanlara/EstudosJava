package Java.Estudos.POOExcecoes;

import java.io.IOException;

public class Throw {
    
    public static void main(String[] args) {
        
        try {
            System.out.println("Antes de gerar a exceção.");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Exceção tratada.");
        }
        System.out.println("1° tratamento.");
        System.out.println();


        try {
            metodo1();
        } catch(ArithmeticException e) {
            e.printStackTrace(); // método da classe Throwable utilizado para imprimir a pilha de erro.
        }
        System.out.println("2° tratamento.");
        System.out.println();

        try {
            int x = 5 / 0;
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Não é possível divisão por 0.");
            throw e;  //ao lançar o erro e, o próximo bloco catch não será executado
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro de índice do array.");
        } finally {  //o bloco finally será executado independente da exceção ter sido lançada
            System.out.println("3° código tratado.");
            System.out.println();
        }
        

    }

    public static void metodo1() {
        throw new ArithmeticException("Exceção do método 1.");
    }


    //Quando o objeto de um subtipo de Exception for lançado, ele terá de ser manipulado ou declarado.
    //Esses objetos são chamados de exceções verificadas e incluem todas as exceções exceto as RuntimeException ou Error.
    void fazerAlgo() throws IOException {
        fazerMais();
    }

    void fazerMais() throws IOException {
        throw new IOException();
    }

}
