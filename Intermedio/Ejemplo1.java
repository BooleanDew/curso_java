public class Ejemplo1{
    public static void main(String[] args) {
        personaHablando();
        personaCaminando();
        sumar();

    }

    // nuestra funcion personaHablando
    public static void personaHablando(){
        System.out.println("La persona esta hablando...");
    }

    public static void personaCaminando(){
        System.out.println("La persona esta caminando...");
    }

    public static void sumar(){
        System.out.println("La suma para tus nuemeros es: "+(3+5));
    }
}