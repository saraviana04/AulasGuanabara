public class Main {

    static int soma(int a, int b){
        int s = a + b;
        return s;
        /*funcao com retorno, o metodo do calculo fico responsavel apenas pelo calculo*/
    }

    public static void main(String[] args) {
	// porem so aparece o que eu boto aqui dentro, mais para isso tenho que fazer a chamada
        System.out.println("comecou o programa");
       int sm = soma(5,2);
       System.out.println("a soma vale " + sm);

    }
}
