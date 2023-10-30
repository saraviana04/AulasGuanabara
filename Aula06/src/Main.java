import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int i = 0;

        Scanner teclado = new Scanner(System.in);

        int nasc = teclado.nextInt();
        System.out.println("Digite seu ano de nascimento");
        int i1 = 2023 - nasc;
        if (i<16){
            System.out.println("Nao vota");

        }else {
            if ((i>=16 && i>18) || (i >70)){System.out.println("pcional");
          }
        }


    }
}
