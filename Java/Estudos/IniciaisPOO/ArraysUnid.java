package Java.Estudos.IniciaisPOO;

public class ArraysUnid {
    
    public static void main(String[] args) {
        
        int[] x = new int[10];    
        lerVetor(x);
        imprimirVetor(x);

        double[] y = new double[5];
        for (double i : y) { //estrutura genérica do for()
            //instruções do for()
        }

        //Array de objetos - tipos de inicialização:
        Conta c1[] = new Conta[2];
        c1[0] = new Conta("luan", 100);
        c1[1] = new Conta("julio", 200);
        Conta c2 = new Conta("zola", 300);
        Conta[] c3 = {c2, new Conta("george", 400)};

    }

    public static void lerVetor(int[] x) {
        for(int i: x) {  //estrutura gerérica do for()
            x[i] = 2*i;
        }
    }

    public static void imprimirVetor(int[] x) {
        for (int i: x) {
            System.out.print(i + "\t");
        }
    }


    

}
