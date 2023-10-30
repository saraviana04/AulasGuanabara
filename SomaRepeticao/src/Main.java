import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int n,s = 0;
	String resp;
        Scanner teclado = new Scanner(System.in);


        do {
            System.out.print("digite um numero:  ");
            n = teclado.nextInt();
            // aqui eu leio e armazeno o numero na variavel n
            s = s + n; //s +=n;
            //aqui e a soma dos numero digitados
            System.out.print("quer continuar?  [s/n]");
            /*aqui eu perguntou se quero continuar digitando ou paro caso for nao,
             caso sim continuo somando os numero*/
            resp = teclado.next();
            /*aqui eu leio a resposta e armazeno na variavel repsosta*/


        }while (resp.equals("s"));

        System.out.println("a soma de todos os valores e " + s);
    }
}
