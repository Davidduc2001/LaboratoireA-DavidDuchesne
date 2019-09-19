import java.util.Scanner;

public class Convertisseur1 {
    public static void main(String[] args) {
        //Variables
        float rad;
        double angle;
        Scanner sc = new Scanner(System.in);

        //Choix de l'angle
        System.out.print("Quel est l'angle en radian? ");
        rad = sc.nextFloat();

        //Opération
        angle = rad*180/Math.PI;

        //Résultat
        System.out.print("Valeur en degré : " + angle);

        sc.close();
    }
}
