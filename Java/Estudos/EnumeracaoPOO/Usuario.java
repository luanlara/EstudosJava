package Java.Estudos.EnumeracaoPOO;

public class Usuario {
    
    private String nome;
    private String cpf;
    private TipoUsuario tipo;

    public Usuario(String nome, String cpf, TipoUsuario tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public String getDados() {
        return "{nome: " + getNome() + ", cpf: " + getCpf() + ", tipo: " + getTipo() + "}";
    }

}
