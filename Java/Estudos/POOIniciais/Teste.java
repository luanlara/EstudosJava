package Java.Estudos.POOIniciais;

public class Teste {
    int codigo;
    static int cont = 0;

    //sobrecarga de métodos: dois ou mais métodos com o mesmo nome variando a lista de parâmetros, independente do tipo de retorno
    public void meuMetodo(int p1) {
        System.out.println(p1);
    }

    public void meuMetodo(double p1) {
        System.out.println(p1);
    }

    public void meuMetodo(String p1) {
        System.out.println(p1);
    }


    //sobrecarga de construtor
    public Teste() { }
    public Teste(int codigo) { }
  
}