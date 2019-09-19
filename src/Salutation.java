import java.util.Scanner;

public class Salutation {

    public static void main(String[] args) {

        //Variables

        String nom = "";
        Scanner sc = new Scanner(System.in);

        //Question
        System.out.print("Quel est ton nom? ");
        nom = sc.nextLine();

        //Bonjours
        System.out.println("Bonjour " + nom);

        sc.close();

    }

}
