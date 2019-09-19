import java.util.Scanner;

public class ExperienceVerte {

        public static void main(String[] args) {

            //Variables
            Scanner sc = new Scanner(System.in);
            int a;
            int b;
            int c;
            int d;
            int e;
            int f;
            int r1;
            int r2;
            int r3;
            int co2;

            //Entrée des données
            System.out.println("Entree des quantites...");
            System.out.print("A > ");
            a = sc.nextInt();
            System.out.print("B > ");
            b =sc.nextInt();
            System.out.print("C > ");
            c = sc.nextInt();
            System.out.print("D > ");
            d = sc.nextInt();
            System.out.print("E > ");
            e = sc.nextInt();
            System.out.print("F > ");
            f = sc.nextInt();

            //Formules R1
            System.out.println("A_0{" + a + "}" + " B_0{" + b + "}" + " C_0{" + c + "}" + " D_0{" + d + "}" + " E_0{"
                    + e + "}" + " F_0{" + f + "}" + " CO2_0{0}");
            System.out.println("R1 : 2A + 4C => 3D + C02");
            r1 = Math.min(a/2, c/4);
            System.out.println("> R1 : " + r1);
            System.out.println("> R1 : " + r1 *2 + "A + " + r1 * 4 + "C => " +r1 * 3 + "B + " + r1 + "CO2");

            //Restants R1
            a = a - (2 * r1);
            c = c - (4 * r1);
            d = d + (3 * r1);
            co2 = r1;
            System.out.println("A_1{" + a + "}" + " B_1{" + b + "}" + " C_1{" + c + "}" + " D_1{" + d + "}" + " E_1{"
                    + e + "}" + " F_1{" + f + "}" + " CO2_1{" +co2 + "}");
            System.out.println();

            //Formules R2
            System.out.println("R2 : B + 2C + E => 4F + 4CO2");
            r2 = Math.min(b, Math.min(c/2, e));
            System.out.println("> R2 : " + r2);
            System.out.println("> R2 : " + r2 + "B + " + r2 * 2 + "C + " + r2 + "E => " + r2 * 4 + "F + " + r2 * 4 +
                    "CO2");

            //Restants R2
            b = b - r2;
            c = c - (2 * r2);
            e = e - r2;
            f = f + (4 * r2);
            co2 = co2 + (4 * r2);
            System.out.println("A_2{" + a + "}" + " B_2{" + b + "}" + " C_2{" + c + "}" + " D_2{" + d + "}" + " E_2{"
                    + e + "}" + " F_2{" + f + "}" + " CO2_2{" +co2 + "}");
            System.out.println();

            //Formules R3
            System.out.println("R3 : A/2 + 4F => B + 4E + CO2");
            r3 = Math.min((a*2), f/4);
            System.out.println("> R3 : " + r3);
            System.out.println("> R3 : " + r3/2 + "A + " + r3 * 4 + "F => " + r3 + "B + " + r3 * 4 + "E + " + r3 +
                    "CO2");

            //Restants R3
            a = a - r3/2;
            f = f - (r3 * 4);
            b = b + r3;
            e = e + (r3 *4);
            co2 = co2 +r3;
            System.out.println("A_3{" + a + "}" + " B_3{" + b + "}" + " C_3{" + c + "}" + " D_3{" + d + "}" + " E_3{"
                    + e + "}" + " F_3{" + f + "}" + " CO2_3{" +co2 + "}");

            sc.close();
        }
}
