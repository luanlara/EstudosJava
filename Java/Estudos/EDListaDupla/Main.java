package Java.Estudos.EDListaDupla;

public class Main {
    
    public static void main(String[] args) {
        
        Lista l = new Lista();
        
        l.inserirInicio(10, "Luan");
        l.inserirFinal(11, "Caique");
        l.inserirFinal(12, "Julia");
        l.inserirFinal(13, "Nereu");
        l.imprimir();

        System.out.println("O nome do RA procurado: " + l.pesquisar(10).nome); 
        l.remover(12);
        l.imprimir();

    }

}
