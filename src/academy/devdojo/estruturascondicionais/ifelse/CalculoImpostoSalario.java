package academy.devdojo.estruturascondicionais.ifelse;

import java.util.Scanner;

public class CalculoImpostoSalario {
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);

        System.out.println("Informe seu salário: ");
        String porcentagem = "";

        float salario = myobj.nextFloat();
        float valorimposto = 0F;

        if (salario > 4000.00) {
            valorimposto = salario * 0.3F;
            porcentagem = "30%";
        } else if (salario > 2000.00) {
            valorimposto = salario * 0.1F;
            porcentagem = "10%";
        } else {
            porcentagem = "0% (isento de impostos)";
        }

        System.out.println("O imposto estipulado sobre seu salário é de: " + porcentagem + " Sendo assim você pagará de imposto: " + valorimposto + ".");
    }
}
