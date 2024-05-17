package academy.devdojo.estruturascondicionais.whiles;

import java.util.Scanner;

public class NumerosImpares {

    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        System.out.println("Digite o valor desejado:");

        int valorFinal = myobj.nextInt();
        int i = 0;

        while (i <= valorFinal) {
            if (i % 2 != 0) {
                System.out.println("i= " + i);
            }
            i++;
        }

    }
}
