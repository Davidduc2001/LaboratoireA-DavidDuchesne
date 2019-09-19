public class Typage {

        public static void main(String[] args) {

            //Variables
            int var1 = 10;
            float var2 = 6/5;
            boolean var3 = false;

            //Conversion 1

            System.out.println("Operation #1 : " + Integer.toString(var1));

            //Conversion 2
            boolean var2bool = (var1 == 10);
            System.out.println("Operation #2 : " + var2bool);
            //Impossible de convertir int en boolean car un boolean ne peut avoir que "true" ou "false"

            //Conversion 3
            Math.round(var2);
            System.out.println("Operation #3 : " + var2);

            //Conversion 4
            Math.round(var2);
            Float.toString(var2);
            System.out.println("Operation 4 : " + var2);

            //Conversion 5
            int var3bool = (var3) ? 1 : 0;
            System.out.println("Operation 5 : " + var3);
        }
}
