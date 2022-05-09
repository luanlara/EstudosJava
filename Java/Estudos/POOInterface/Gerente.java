package Java.Estudos.POOInterface;

public class Gerente extends Funcionario implements Autenticavel {
    
    private String usuario;
    private String senha;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public boolean logar(String senha) {
        if(this.senha != senha) return false;
        return true;
    }

}
