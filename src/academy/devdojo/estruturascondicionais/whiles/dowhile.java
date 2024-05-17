package academy.devdojo.estruturascondicionais.whiles;
import java.util.Scanner;
import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        boolean condicao = false;

        do {
            System.out.println("Úsuario 1 insira seu número:");
            int n1 = myobj.nextInt();

            System.out.println("Úsuario 2 insira seu número:");
            int n2 = myobj.nextInt();

            if (n1 == n2){
                System.out.println("Números iguais");

            } else {
                System.out.println("Números não são iguais");
            }

            System.out.println("Deseja continuar? / 1.Sim / 2.Não /");
            int i = myobj.nextInt();

            if (i == 1){
                condicao = true;
            } else if (i == 2){
                condicao = false;
            }else {
                System.out.println("Número inválido");
            }

        } while (condicao);




    }
}
