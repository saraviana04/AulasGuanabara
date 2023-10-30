import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	/*Media condiçaõ composta com IF e ELSE*/
        Scanner teclado = new Scanner(System.in);

        System.out.println("primeira nota:  ");
        float n1 = teclado.nextFloat();
        System.out.println("segunda nota:  ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("sua nota foi: " + m);
        if (m>=9) {
            System.out.println("Parabens Voce e o cara");
        }else {
            System.out.println("Precisa melhorar");
        }
    }
}
