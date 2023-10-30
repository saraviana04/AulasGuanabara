import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	int n;
	do {
	    n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>informe um numero:<br><em>(valor 0 interrompe)</em> </html>"));
	    /*caixa com mensagem*/
        JOptionPane.showMessageDialog(null,"voce digitou o valor" + n);
        /*para mostrar o numero digido*/


    }while (n!=0);
	/*while diz que o numero tem que ser diferente de 0*/


    }

}
