import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int v;
    String par;
    String impar;


        Scanner scanner = new Scanner(System.in);


    System.out.println("Digite o valor: ");
    v = scanner.nextByte();
    if (v%2 ==0){
       System.out.println("Par");

    }else{

        System.out.println("Impar");
    }
    }
}



