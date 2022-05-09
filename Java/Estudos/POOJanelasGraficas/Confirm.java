package Java.Estudos.POOJanelasGraficas;

import javax.swing.JOptionPane;

public class Confirm {
    
    public static void main(String[] args) {
        int resp;

        resp = JOptionPane.showConfirmDialog(null, "Deseja finalizar?");
        if (resp == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa será finalizado.");
        }
    }

}
