package academy.devdojo.arrays;
import java.util.Scanner;

public class MultArrays {
    public static void main(String[] args) {

        int[] v1 = new int[3];
        int[] v2 = new int[3];
        int[] vr = new int[3];
        Scanner myobj = new Scanner(System.in);

        for (int i = 0; i < v1.length; i++) {
            System.out.println("V1 posição "+(i+1)+":");
            v1[i] = myobj.nextInt();

            System.out.println("V2 posição "+(i+1)+".");
            v2[i] = myobj.nextInt();

            vr[i] = v1[i] * v2[i];
            System.out.println(v1[i]+" x "+v2[i]+" = "+vr[i]);
        }


    }
}
