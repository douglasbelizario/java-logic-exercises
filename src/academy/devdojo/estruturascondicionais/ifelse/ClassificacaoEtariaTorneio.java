package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class ClassificacaoEtariaTorneio {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        System.out.println("|Classificação etária para torneio|");
        System.out.println("Informe sua idade: ");
        int idade = myobj.nextInt();

        if (idade >= 20 ){
            System.out.println("Participará na categoria adulta!");
        } else if (idade >= 16) {
            System.out.println("Participará na catergoria pré adulta!");
        } else if (idade >= 11) {
            System.out.println("Participará na categoria Juvenil!");
        }else {
            System.out.println("Participará na categoria infantil");
        }


    }
}
