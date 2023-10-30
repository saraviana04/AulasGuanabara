import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Digite o codigo
       Scanner t= new Scanner(System.in);
       System.out.println("Em que ano voce nasceu: ");
       int nasc = t.nextInt();
       int i= 2023-nasc;
       if (i>=18){
           System.out.println("maior de idade parabens");
       }else {
           System.out.println("menor de idade");
       }



 }
}


