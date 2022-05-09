package Java.Estudos.POOInterface;

public class SistemaDeControle {
    
    public void logar (Autenticavel a) {
        String senha = "";
        boolean ok = a.logar(senha);
    }

}
