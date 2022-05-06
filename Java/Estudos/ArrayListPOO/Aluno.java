package Java.Estudos.ArrayListPOO;

public class Aluno {
    
    private int ra;
    private String nome;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return ra + "\n" + nome;
    }
    

}
