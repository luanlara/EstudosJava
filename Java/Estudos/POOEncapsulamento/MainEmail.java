package Java.Estudos.POOEncapsulamento;

public class MainEmail {
    
    public static void main(String[] args) {
        
        Email e = new Email();
        e.setComercial("xxxx@espm.br");
        e.setPessoal("luan@gmail.com");

        System.out.println("Email pessoal: " + e.getPessoal());
        System.out.println("Email comercial: " + e.getComercial());

    }

}
