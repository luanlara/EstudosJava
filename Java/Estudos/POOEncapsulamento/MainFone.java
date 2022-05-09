package Java.Estudos.POOEncapsulamento;

public class MainFone {
    
    public static void main(String[] args) {
        Fone f = new Fone();
        f.comercial = "(11) 2959-4037";
        f.residencial = "(11) 98757-7273";

        System.out.println(f.retornarDados());
    }

}
