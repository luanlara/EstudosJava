package Java.Estudos.POOInterface;

public class Main {
    
    public static void main(String[] args) {

        SistemaDeControle sc = new SistemaDeControle();
        Autenticavel diretor = new Diretor();
        Autenticavel gerente = new Gerente();
        Autenticavel cliente = new Cliente();


        sc.logar(diretor);
        sc.logar(gerente);
        sc.logar(cliente);
        

    }

}
