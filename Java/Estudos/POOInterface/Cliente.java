package Java.Estudos.POOInterface;

public class Cliente implements Autenticavel {
    
    private String senha;
    private String usuario;

    public boolean logar(String senha) {
        if(this.senha != senha) return false;
        return true;
    }
    

}
