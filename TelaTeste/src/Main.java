import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
	// write your code here
        int n  = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um numero: "));
        JOptionPane.showInputDialog(null,"voce digitou o valor : " + n);
    }
}
