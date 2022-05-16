package Java.Estudos.EDQuizIVRecursividade;

public class Ex3 {
    
    public static void main(String[] args) {
         
        int x = misteriosa(1);
        int y = misteriosa(3);
        int z = misteriosa(4);

        System.out.println(x + "\n" + y + "\n" + z);

    }

    public static int misteriosa(int a) {
        if (a < 1) {
            return -1;
        } else if (a == 1) {
            return 2;
        } else {
            return (misteriosa(a - 1) * misteriosa(a - 2));
        }
    }

}
