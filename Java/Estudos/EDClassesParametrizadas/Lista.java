package Java.Estudos.EDClassesParametrizadas;

public class Lista<E> {
    
    int tamanho;
    No inicio, fim;

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
