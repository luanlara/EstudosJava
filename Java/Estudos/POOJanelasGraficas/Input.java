package Java.Estudos.POOJanelasGraficas;

import javax.swing.JOptionPane;

public class Input {
    
    public static void main(String[] args) {
        
        String nome;
        String auxIdade;
        int idade;
        nome = JOptionPane.showInputDialog(null, "Informe seu nome");

        auxIdade = JOptionPane.showInputDialog(null, "Qual sua idade?");
        idade = Integer.parseInt(auxIdade);  //converte String para inteiro

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" + "Idade: " + idade);

    }

}
