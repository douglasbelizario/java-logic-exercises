package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class AlistamentoQuartel {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        String genderUser = "";
        int ageUser = 0;

        System.out.println("*||Bem vindo ao alistamento obrigatório||*");
        System.out.println("Informe sua idade: ");
        ageUser = myobj.nextInt();
        System.out.println("");
        System.out.println("Informe seu sexo (M) masculino (F) feminino.");
        genderUser = myobj.next();

        if (ageUser < 18){
            System.out.println("Alistamento não permitido.");
        } else if (genderUser.equalsIgnoreCase("m")) {
            System.out.println("Alistamento obrigatório.");
        } else if (genderUser.equalsIgnoreCase("f")) {
            System.out.println("Deseja se alistar? (s) Sim ou (n) não.");
            String choiceUser = myobj.next();
            if (choiceUser.equalsIgnoreCase("s")){
                System.out.println("Parabéns alistamento voluntário");
            } else {
                System.out.println("Não alistada.");
            }
        } else {
            System.out.println("Informação incorreta");
        }

    }
}
