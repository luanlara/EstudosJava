package Java.Estudos.EDClassesParametrizadas;

public class No<E> {
    
    E elemento;
    No<E> esq, dir;
    int tamanho;
    No inicio, fim;

    public No(E elemento) {
        this.elemento = elemento;
        this.esq = null;
        this.dir = null;
    }

    public void inserir(E elemento) {
        No<E> aux = new No<E>(elemento);
        aux.esq = null;

        if (tamanho == 0) {
            aux.dir = null;
            fim = aux;
        } else {
            aux.dir = inicio;
            inicio.esq = aux;
        }
        inicio = aux;
        tamanho++;
    }

    public void imprimir() {
        No<E> aux = inicio;
        while (aux != null) {
            System.out.println(aux.elemento);
            System.out.println();
            aux = aux.dir;
        }
    }
}
