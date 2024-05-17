package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CadastroLogin {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.println("Informe um login");
        String nameUser = "";

        nameUser = myobj.next();

        if(nameUser.equalsIgnoreCase("admin") || nameUser.equalsIgnoreCase("administrador") || nameUser.isEmpty()){
            System.out.println("Usuário inválido");
        }else {
            System.out.println("Usuário " + nameUser + " cadastrado com sucesso.");
        }
    }
}
