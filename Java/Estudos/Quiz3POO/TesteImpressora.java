package Java.Estudos.Quiz3POO;

public class TesteImpressora {
    
    public static void main(String[] args) {
        
        Impressora[] impressora = new Impressora[3];
        impressora[0] = new Laser();
        impressora[1] = new JatoDeTinta();
        impressora[2] = new Matricial();

        for(int i = impressora.length; i >=0; i--) {
            impressora[i].imprimir();
        }

    }

}
