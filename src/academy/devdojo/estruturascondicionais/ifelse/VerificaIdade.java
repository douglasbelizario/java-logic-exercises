package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = myobj.nextInt();

        if (idade >= 18){
            System.out.println("Pessoal adulta");
        }else {
            System.out.println("Não é adulta");
        }

    }
}
