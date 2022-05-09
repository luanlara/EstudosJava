package Java.Estudos.POOExcecoes;

public class ExcecaoNCapturada {

    //3) Volta.
    public static void main(String[] args) {
        fazerAlgo();
    }

    //2) Como ela não é tratada, ela volta para o método chamador
    public static void fazerAlgo() {
        fazerAlgoDiferente();
    }

    //1) A exceção gerada não é tratada.
    public static void fazerAlgoDiferente() {
        int x = 5 / 0;
    }

}
