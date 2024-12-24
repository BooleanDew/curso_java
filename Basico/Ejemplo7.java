public class Ejemplo7 {
    public static void main(String[] args) {
        // sentencias de control
        String usuario = "admin";
        String clave = "1234";

        boolean ok = false;// good boy
        ok = (usuario == "guest") && (clave=="333");// bad boy
     
        if (ok) {
            System.out.println("acceso concedido");
        }else{
            System.out.println("Acceso denegado: usuario o clave incorrecta");
        }

       
    }
}
