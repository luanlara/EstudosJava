package Java.Estudos.IniciaisPOO;

public class Main {
    
    public static void main(String[] args) {
        System.out.println(Teste.cont);

        System.out.println(Conta.limiteCredito);
        Conta.aumentarCredito();
        System.out.println(Conta.limiteCredito);

        Conta conta1 = new Conta("Lu", 100);
        Conta conta2 = new Conta("Luan", 200);

        //o objeto conta1 não será mais utilizado --> vira conta2
        conta1 = conta2;
        System.out.println(conta1.nome + " | " + conta1.saldo);

        //assim que o método criarObjeto finalizar a execução, a variável "conta" será destruída porque pé uma variável local ao método
        Conta conta = criarObjeto();
        System.out.println(conta.nome);

    }

    public static Conta criarObjeto() {
        Conta conta = new Conta("Lu", 20);
        return conta;
    }

}
