import java.text.DecimalFormat;
import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args) {

        //Variables
        Scanner sc = new Scanner(System.in);
        float angle;
        float rad;
        DecimalFormat decimalFormat = new DecimalFormat("###.##");

        //Question 2
        System.out.print("Quel est l'angle en degrés? ");
        angle = sc.nextFloat();
        System.out.println();

        //Opération
        rad = (float) Math.toRadians(angle);

        //Résultat
        System.out.println("Valeur en radians : " + rad);
        System.out.println("Valeur en radian formatée : " + decimalFormat.format(rad));

        sc.close();
    }

}
