import java.util.Scanner;

public class Resolution {

        public static void main(String[] args){

            //Variables
            Scanner sc = new Scanner(System.in);
            double a;
            double b;
            double c;
            double dis;
            double x1;
            double x2;

            //Entrée des valeurs
            System.out.println("Entree des valeurs...");
            System.out.print("a > ");
            a = sc.nextDouble();
            System.out.print("b > ");
            b = sc.nextDouble();
            System.out.print("c > ");
            c = sc.nextDouble();
            System.out.println("Équation : " + a + "x2 + " + b + "x + " + c + " = 0");

            //Calculs
            dis = (Math.pow(b, 2) - ( 4 *a *c));
            x1 = ((-b + Math.sqrt(dis)) / (2 * a));
            x2 = ((-b - Math.sqrt(dis)) / (2 * a));

            //Affichages des résultats
            System.out.println("discriminant " + dis);
            System.out.println("X1 : " + x1);
            System.out.println("X2 : " + x2);

            sc.close();

        }
}
