package Java.Estudos.POOEncapsulamento;

public class Fone {
    
    public String comercial, residencial;

    public String retornarDados() {
        String aux = "";
        aux += "Fone comercial: " + comercial + "\n";
        aux += "Fone residencial: " + residencial + "\n";
        return aux;
    }

}
