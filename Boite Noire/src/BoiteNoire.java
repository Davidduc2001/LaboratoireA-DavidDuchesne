import java.text.DecimalFormat;

public class BoiteNoire {

        public static void main(String[] args) {

            //Variables
            double poidsBoite = 375.0; //kg
            double volumeBoite = 125.0; //m3
            double mVolSphere = 3517.0; //Kg/m3
            double rayonSphere = 2.15; //m
            double mVolSubstanceIsolation =13545.88; //kg/m3
            DecimalFormat decimalFormat = new DecimalFormat("###.##");

            //Calculs sphere
            double volumeSphere = (4 * Math.PI * (Math.pow(rayonSphere,3)) / 3);
            double poidsSphere = (volumeSphere * mVolSphere);

            //Calculs substance isolante
            double volumeSubstanceIsolation = (volumeBoite - volumeSphere);
            double poidsSubstanceIsolation = (volumeSubstanceIsolation * mVolSubstanceIsolation);
            double quantiteSubstanceIsolation = (volumeSubstanceIsolation *1000);

            //Calculs Boite noire
            double poidsTotal = (poidsBoite + poidsSphere + poidsSubstanceIsolation);

            // Affichage du rapport d'informations
            System.out.println("-------------------------------------------");
            System.out.println("- RAPPORT D'INFORMATIONS");
            System.out.println(" Sphere");
            System.out.println(" * Masse volumique : " + decimalFormat.format(mVolSphere) + " kg/m3");
            System.out.println(" * Poids : " + poidsSphere + " kg");
            System.out.println(" * Rayon : " + rayonSphere + " m");
            System.out.println(" * Volume : " + volumeSphere + " m3");
            System.out.println(" Substance isolante");
            System.out.println(" * Masse volumique : " + mVolSubstanceIsolation + " kg/m3");
            System.out.println(" * Poids : " + poidsSubstanceIsolation + " kg");
            System.out.println(" * Volume : " + volumeSubstanceIsolation + " m3");
            System.out.println(" * Quantite : " + quantiteSubstanceIsolation + " l");
            System.out.println(" Boite noire");
            System.out.println(" * Poids : " + decimalFormat.format(poidsBoite) + " kg");
            System.out.println(" * Volume : " + decimalFormat.format(volumeBoite) + " m3");
            System.out.println(" * Poids total : " + poidsTotal + " kg");
            System.out.println("-------------------------------------------");

        }
}
