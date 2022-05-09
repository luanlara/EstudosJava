package Java.Estudos.EDListaDupla;

public class Lista {
    
    No inicio, fim; //duas variáveis para referenciarem objetos do tipo No na memória.
    int tamanho; //variável usada para armazenar o tamanho da lista (n° de nós)

    public Lista() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inserirInicio(long ra, String nome) {No aux = new No();
        aux.ra = ra;
        aux.nome = nome;
        aux.esq = null;
        if(tamanho == 0) {
            aux.dir = null;
            fim = aux;
        } else {
            aux.dir = inicio;
            inicio.esq = aux;
        }
        tamanho++;
        inicio = aux;
    }

}
