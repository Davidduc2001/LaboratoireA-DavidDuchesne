public class Geometrie {

    public static void main(String[] args) {

        //Variables
        double rayon;
        double surface;
        double longueur;
        double volume;
        double hauteur;
        double apotheme;

        //Cercle
        rayon = 10.0;
        surface = (float)(Math.PI * Math.pow(rayon, 2));
        System.out.println("Le cercle");
        System.out.println(" - Rayon    : " + rayon);
        System.out.println(" - Surface  : " + surface);
        System.out.println();

        //Cube
        longueur = 7.0;
        surface = (float)(6 * (Math.pow(longueur, 2)));
        volume = (float)(Math.pow(longueur, 3));
        System.out.println("Le cube");
        System.out.println(" - Longueur : " + longueur);
        System.out.println(" - Surface  : " + surface);
        System.out.println(" - Volume   : " + volume);
        System.out.println();

        //Cylindre
        rayon = 10.0;
        hauteur = 5.0;
        surface = (float)(2 * (Math.PI * Math.pow(rayon, 2)) + (2 * Math.PI * rayon * hauteur));
        volume = (float)(Math.PI * Math.pow(rayon, 2) * hauteur);
        System.out.println("Le cylindre");
        System.out.println(" - Rayon    : " + rayon);
        System.out.println(" - Hauteur  : " + hauteur);
        System.out.println(" - Surface  : " + surface);
        System.out.println(" - Volume   : " + volume);
        System.out.println();

        //Cône
        rayon = 3.0;
        hauteur = 7.0;
        apotheme = (float)(Math.sqrt(Math.pow(rayon, 2) + (Math.pow(hauteur, 2))));
        surface = (float)((Math.PI * Math.pow(rayon, 2)) + (Math.PI * rayon * apotheme));
        volume = (float)(((Math.PI * Math.pow(rayon, 2)) * hauteur)/3);
        System.out.println("Le cône");
        System.out.println(" - Rayon    : " + rayon);
        System.out.println(" - Hauteur  : " + hauteur);
        System.out.println(" - Apothème : " + apotheme);
        System.out.println(" - Surface  : " + surface);
        System.out.println(" - Volume   : " + volume);

    }
}
