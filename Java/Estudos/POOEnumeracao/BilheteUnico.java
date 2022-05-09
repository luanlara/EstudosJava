package Java.Estudos.POOEnumeracao;

public class BilheteUnico {
    
    private int numero;
    private Usuario usuario;
    private double saldo;
    private double valorDaPassagem = 4.4;

    public BilheteUnico(int numero, Usuario usuario, double saldo) {
        this.numero = numero;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getDados() {
        return "Número: " + getNumero() + " | CPF: " + usuario.getCpf() +
        " | Nome: " + usuario.getNome() + " | Tipo: " + usuario.getTipo() + 
        " | Saldo: " + saldo;
    }

    public void passarNaCatraca() {
        if (saldo < valorDaPassagem) {
            System.out.println("Você não possui saldo suficiente.");
        } else {
            saldo = saldo - valorDaPassagem;
        }
    }

    public void carregarBilhete(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        }
    }

}
