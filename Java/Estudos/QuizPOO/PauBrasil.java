package Java.Estudos.QuizPOO;

public class PauBrasil extends Arvore {
    
    public static void main(String[] args) {
        new PauBrasil().go();
    }

     void go() {
         go2(new Arvore(), new PauBrasil());
         go2((PauBrasil) new Arvore(), new PauBrasil());
    }

     void go2(Arvore t1, PauBrasil r1) {
         PauBrasil r2 = (PauBrasil) t1;
        Arvore t2 = (Arvore) r1;
    }

}
