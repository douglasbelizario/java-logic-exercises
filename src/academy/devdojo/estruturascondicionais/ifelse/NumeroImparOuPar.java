package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class NumeroImparOuPar {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        System.out.println("Informe um número para saber se é ímpar ou par: ");
        int n = myobj.nextInt();

        if(n % 2 == 0){
            System.out.println("O número é par!");
        }else {
            System.out.println("O número é ímpar!");
        }
    }
}
