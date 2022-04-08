package Exercicio2Simples;

public class Main {

    public static void main(String[] args) {
        No p1, p2, pw;
        p1 = new No();
        p1.campo1 = 5;
        p1.campo2 = null;
    
        pw = new No();
        pw.campo2 = p1.campo2;
        p1.campo2 = pw;
        pw.campo1 = 10;

        p2 = new No();
        p2.campo2 = pw.campo2;
        p2.campo1  = 15;

        p1.imprimir();
        p2.imprimir();
        pw.imprimir();

        p1.misterio(p1);
        
    }


}
