import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String valor= "30";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano que voce nasceu? ");
        int nasc = teclado.nextInt();
        /*to chamando e declando a variavel nascimento*/
        int i = 2023 - nasc;
        /*calculo acima do ano de nascimento*/
        int idade = Integer.parseInt(valor);
        idade = 2023 - nasc;
        System.out.println("sua idade e" + idade);


        if (i <16 ){
            System.out.println("voce Nao vota");
        }else{ if (i >=18 ){
            System.out.println("Voce e obrigado(a) a vota! ");
        }else{ if (i >=70){
            System.out.println("voto opcional");
        }


    }
}}}
