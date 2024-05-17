package academy.devdojo.estruturascondicionais.switchcase;

import java.util.Scanner;

public class TipoContaBancaria {
    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);

        System.out.println("Selecione o tipo de conta que você deseja:");
        System.out.println("(1) - Conta corrente.\n(2) - Conta poupança.\n(3) - Conta investimento.");

        int typeAccont = myobj.nextInt();

        switch (typeAccont){
            case 1:
                System.out.println("Conta corrente.\nJuros: 0.02%");
                break;
            case 2:
                System.out.println("Conta poupança.\nJuros: 0.05%");
                break;
            case 3:
                System.out.println("Conta investimento.\nJuros: 0.1%");
                break;
            default:
                System.out.println("Tipo de conta inválido");
                break;
        }
    }
}
