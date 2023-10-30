import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int n, s =0;
        String totalPar = null,totalImpar;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                   "<html>Informe um numero: <br><em>(valor 0 interrompe)</em></html>" ));
            s += n;




        }while (n !=0);


        JOptionPane.showMessageDialog(null, "<html>Resultado final<br>------------------" +
                "<br>somatoria vale " + s + "</html>");






    }
}
