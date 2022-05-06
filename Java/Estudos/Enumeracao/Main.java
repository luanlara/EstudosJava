package Java.Estudos.Enumeracao;

public class Main {
    
    public static void main(String[] args) {
        
        Usuario c = new Usuario("516.185.958-06", "Luan Lara", TipoUsuario.Estudante);

        System.out.println(c.getDados());
        System.out.println();

        BilheteUnico b1 = new BilheteUnico(1234567890, c, 4);

        b1.carregarBilhete(4);
        b1.passarNaCatraca();
        b1.passarNaCatraca();
        b1.carregarBilhete(2);
        b1.passarNaCatraca();
        System.out.println(b1.getDados());


    }

}
