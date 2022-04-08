package Exercicio2Simples;

public class No {
    
    int campo1;
    No campo2;
    No prox; 
    No inicio = null;
    No fim = null;


    public void inserirInicio(int valor) {
        No aux = new No();
        aux.campo1 = valor;

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
        aux.campo1 = valor;
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
            System.out.println(aux.campo1);
            aux = aux.prox;
        }
    }

    public void misterio(No e) {
        while(e != null) {
            System.out.println(e.campo1);
            e = e.campo2;
        }
    }

   
}

