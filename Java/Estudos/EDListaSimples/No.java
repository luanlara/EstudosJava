package Java.Estudos.EDListaSimples;

public class No {
    
    int info;
    No prox; //é uma variável de referência para um objeto do tipo No (referencia o próximo nó da lista)
    No inicio = null;
    No fim = null;
    
    public void inserirInicio(int valor) {
        No aux = new No();
        aux.info = valor;

        if(inicio == null) {
            aux.prox = null;
            fim = aux;
        } else {
            aux.prox = inicio;
        }
        inicio = aux;
    }

    public void inserirFinal(int valor) {
        No aux = new No();
        aux.info = valor;
        aux.prox = null;

        if(inicio == null) {
            inicio = aux;
        } else {
            fim.prox = aux;
        }
        fim = aux;
    }
    
    public void imprimir() {
        No aux = inicio;  //a variável aux referencia o primeiro nó da lista
        
        while(aux != null) {
            System.out.println(aux.info);
            aux = aux.prox;
        }
    }

    public No pesquisar(int valor) {
        No aux = inicio;
        No achou = null;

        while(aux != null && achou == null) {
            if(aux.info == valor) {
                achou = aux;
            }
            aux = aux.prox;
        }
        return achou;
    }

    public void remover(int valor) {
        No aux = pesquisar(valor);
        if(aux != null) {
            if(aux == inicio) {
                inicio = inicio.prox;
            } else {
                No anterior = inicio;
                while(anterior.prox != aux) {
                    anterior = anterior.prox;
                }
                if (aux == fim) {
                    anterior.prox = null;
                    fim = anterior;
                } else {
                    anterior.prox = aux.prox;
                }
            }
            aux = null;
        } 
    }


}
