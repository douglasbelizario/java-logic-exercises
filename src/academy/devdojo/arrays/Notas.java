package academy.devdojo.arrays;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        double[] notas = new double[3];
        Scanner myobj = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota "+(i+1)+":");
            notas[i] = myobj.nextDouble();
        }
        double media = 0;

        for (int i = 0; i < notas.length; i++) {
            media = media + notas[i];
            System.out.println("Prova "+(1+i)+": "+notas[i]);
        }

        media = media / notas.length;
        System.out.println("Média: "+media);

    }
}
