package Java.Estudos.Heranca;

public class Pessoa {
    
    String nome;
    int idade;
    protected int x = 9;  //a classe filha consegue acessar através da herança

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

}
