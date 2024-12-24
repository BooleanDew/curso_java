public class Ejemplo5{
    public static void main(String[] args) {
        // operadores relacionales
        // ==, <=,>=, <, >, !=
        boolean ok = 3==4;
        System.out.println(ok);
        String usuario = "admin";
        boolean autorizado = usuario.length() < 2;
        System.out.println(autorizado);
        char  genero = 'M';
        boolean esFemenino = genero == 'F'; 
        System.out.println(esFemenino);
    }
}