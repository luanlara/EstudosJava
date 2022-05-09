package Java.Estudos.POOPolimorfismoInterface;

public class Main {

    public static void main(String[] args) {
        
        Gerente g = new Gerente();
        Funcionario f1 = g;  //o gerente g passa a ser um funcionário

        g.setCodigo(1);
        g.setUsuario("Luan");
        g.setSenha("1234");

        System.out.println(g); //o método toString será invocado
        

    }

}
