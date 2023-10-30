import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int num[] = {3,5,1,8,4};
	for(int valor: num ){
		System.out.print(valor + " ");
		/* nesse for eu posso para me mostra todos o valores que eu tenho na tela */
	}


		System.out.println("");
     /*esse system de cima faz  a quebra */

	int pos = Arrays.binarySearch(num, 8);
	/*essa arrays e para achar a posicao exata que esta*/
        /* lembrando que a contagem e sempre pelo 0.*/

	    System.out.println("encontrei o valor na posicao " + pos);

    }
}
