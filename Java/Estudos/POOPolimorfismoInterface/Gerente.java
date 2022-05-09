package Java.Estudos.POOPolimorfismoInterface;

public class Gerente extends Funcionario {
    
    private String usuario;
    private String senha;

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String toString() {
        return "Código: " + super.getCodigo() + " | Usuário: " + usuario; 
    }

}
