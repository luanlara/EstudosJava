package Java.Estudos.Heranca;

public class Main {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Luan", 19, 10);
        Pessoa p1 = new Pessoa("Lu", 19);
        Pessoa p2 = (Pessoa)a1;

        a1.imprimir();

        //Testas a classe de um objeto usando instanceof
        if(a1 instanceof Aluno) {
            System.out.println("Foi");
        } else {
            System.out.println("Não foi");
        }

        

    }



}
