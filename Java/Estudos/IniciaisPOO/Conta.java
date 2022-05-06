package Java.Estudos.IniciaisPOO;

public class Conta {
    
    String nome;
    double saldo;
    static double limiteCredito = 500;
    

    public Conta(double saldo) {
        this(null, saldo); //"this" chamando o construtor Conta sobrecarregado
    }

    //construtor com referência this: diferenciar o parâmetro do atributo por terem o mesmo nome
    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }


    public static void aumentarCredito() {
        limiteCredito *= 1.2;
    }



}
