public class Ejemplo8 {
    public static void main(String[] args) {
        // sentecias repetitivas

        // sentecia repetitiva definida FOR
        /*
         * int tabla = 3;
         * int hasta = 100;
         * for(int i=1; i<=hasta; i++){
         * System.out.println(i+"x"+tabla+" = "+i*tabla);
         * }
         */

        // sentencia repetitiva indefinida WHILE
        /*
         * 
         * int i = 1;
         * 
         * while(i<10){
         * System.out.println(i+") me estoy repitiendo indefinidamente");
         * i++;
         * }
         */

        int opcion = 1;
        switch (opcion) {
            case 0:
                System.out.println("suamar");
                break;
            case 1:
                System.out.println("restar");
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion invalida");

        }

    }

}
