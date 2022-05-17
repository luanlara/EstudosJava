package Java.Estudos.EDListaDupla;

public class Lista {
    
    No inicio, fim; //duas variáveis para referenciarem objetos do tipo No na memória.
    int tamanho; //variável usada para armazenar o tamanho da lista (n° de nós)

    public Lista() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public void inserirInicio(long ra, String nome) {
        No aux = new No();
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

    public void inserirFinal(long ra, String nome) {
        No aux = new No();
        aux.ra = ra;
        aux.nome = nome;
        aux.dir = null;
        if(tamanho == 0) {
            aux.esq = null;
            inicio = aux;
        } else {
            aux.esq = fim;
            fim.dir = aux;
        }
        tamanho++;
        fim = aux;
    }

    public void imprimir() {
        No aux = inicio;
        while(aux != null) {
            System.out.println("RA: " + aux.ra);
            System.out.println("Nome: " + aux.nome);
            System.out.println();
            aux = aux.dir;
        }
    }

    public No pesquisar(long ra) {
        No aux = inicio;
        boolean achou = false;
        while (aux != null && !achou) {
            if(aux.ra == ra) {
                achou = true;
            } else {
                aux = aux.dir;
            }
        }
        return aux;
    }

    public boolean remover(long ra) {
        No aux = pesquisar(ra);
        boolean realizado = false;
        if (aux != null) {
            if(tamanho == 1) {
                aux.dir = null;
                aux.esq = null;
                fim = null;
            } else if (aux == inicio) {
                inicio = aux.dir;
                inicio.esq = null;
                aux.dir = null;
            } else if (aux == fim) {
                fim = aux.esq;
                fim.dir = null;
                aux.esq = null;
            } else {
                aux.esq.dir = aux.dir;
                aux.dir.esq = aux.esq;
                aux.dir = null;
                aux.esq = null;
            }
            tamanho--;
            realizado = true;
        }
        return realizado;
    }

}
