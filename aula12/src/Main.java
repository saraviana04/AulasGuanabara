public class Main {

    public static void main(String[] args) {


        int cc= 0 ;
        while (cc<10) {
            cc++;
            if (cc==2 || cc== 3 || cc==4)
            { continue;
                /*aqui ele nao mostra o 2,3 e 4 , porem continuar a mostra os outros*/
        }
             if (cc == 7){
            break;
            /*aqui ele para nao continuar a contar*/
        }

        System.out.println("contagem" +cc);
    }
}}
