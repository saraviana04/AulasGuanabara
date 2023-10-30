import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantas pernas?:");
        int perna = tec.nextInt();
        String tipo;
        System.out.print("isso e um(a)  ");
        switch (perna){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "Bipede";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo =  "ET";
        }System.out.println(tipo);
    }
}
