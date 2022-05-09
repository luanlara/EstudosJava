package Java.Estudos.POOInterface;

public class Diretor extends Funcionario implements Autenticavel {

    private String usuario;
    private String senha;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public boolean logar(String senha) {
        if(this.senha != senha) return false;
        return true;
    }



    

}
