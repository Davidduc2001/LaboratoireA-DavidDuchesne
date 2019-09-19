import java.util.Scanner;

public class Vecteurs {

    public static void main(String[] args) {

        //Variables
        double xa;
        double xb;
        double ya;
        double yb;
        double za;
        double zb;
        double dist;
        Scanner sc = new Scanner(System.in);

        //Questions à l'utilisateur poin A
        System.out.println("Quel sont les coordonnés du point A? ");
        System.out.print("xa : ");
        xa = sc.nextFloat();
        System.out.print("ya : ");
        ya = sc.nextFloat();
        System.out.print("za : ");
        za = sc.nextFloat();

        //Affichage point A
        System.out.print("Le point A : ");
        System.out.print(xa + ",");
        System.out.print(ya + ",");
        System.out.print(za);

        //Questions point B
        System.out.println();
        System.out.println("Quel sont les coordonnés du point B? ");
        System.out.print("xb : ");
        xb = sc.nextFloat();
        System.out.print("yb : ");
        yb = sc.nextFloat();
        System.out.print("zb : ");
        zb = sc.nextFloat();

        //Affichage point B
        System.out.print("Le point B : ");
        System.out.print(xb + ",");
        System.out.print(yb + ",");
        System.out.println(zb);

        //Opération
        dist = Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2) + Math.pow(zb -za, 2));

        //Résultat
        System.out.print("La distance est : " + dist);

        sc.close();

    }
}
