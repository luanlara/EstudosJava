package Java.Estudos.POOJanelasGraficas;

import javax.swing.JOptionPane;

public class Message {
    
    public static void main(String[] args) {
        
        int x = 2;

        //o primeiro parâmetro leva null para indicar que a janela será centralizada no vídeo
        JOptionPane.showMessageDialog(null, "O valor de x é: " + x);

        //o segundo texto "" é o título da janela
        JOptionPane.showMessageDialog(null, "Boa aula", "Caixa Teste", JOptionPane.DEFAULT_OPTION);
        JOptionPane.showMessageDialog(null, "Cuidado! Risco de XXX", "Erro", JOptionPane.ERROR_MESSAGE);


    }

}
