package Java.Estudos.HerancaPOO;

public class Aluno extends Pessoa {
    int serie;

    public Aluno(String nome, int idade, int serie) {
        super(nome, idade);
        this.serie = serie;
    }

    public void imprimir() {
        System.out.println(x);
    }
    
}
