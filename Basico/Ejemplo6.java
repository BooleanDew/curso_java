public class Ejemplo6 {
    public static void main(String[] args) {
        // operadores logicos
        // && , ||, !
         // ==, <=,>=, <, >, !=

        boolean ok = !true;
        System.out.println(ok);

        String usuario = "admin";
        String clave = "12345";
        boolean acceso1 = (usuario=="guest") || (clave=="12345");
        System.out.println(acceso1);

        boolean acceso2 = !(usuario=="guest") && (clave=="12345");
        System.out.println(acceso2);
    }
}
