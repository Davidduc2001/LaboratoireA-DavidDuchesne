import java.text.DecimalFormat;
import java.util.Scanner;

public class Pythagore {

    public static void main(String[] args) {

        //Variables
        int cote1;
        int cote2;
        double hyp;
        Scanner sc =new Scanner(System.in);

        //Questions
        System.out.print("Entrez la valeur du premier côté ");
        cote1 = sc.nextInt();
        System.out.println();
        System.out.print("Entrez la valeur du second côté ");
        cote2 = sc.nextInt();
        System.out.println();

        //Opération
        hyp = Math.sqrt(Math.pow(cote1, 2) + Math.pow(cote2, 2));

        //Résultat
        System.out.print("La valeur de l'hypothénuse est : " + hyp);

        sc.close();
    }
}
