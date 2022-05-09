package Java.Estudos.POOArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(10, "Lu"));
        lista.add(new Aluno(11, "Ju"));

        Aluno a;

        //impressão de um ArrayList
        for (Aluno k : lista) {
            System.out.println(k);
        }

    }

}
