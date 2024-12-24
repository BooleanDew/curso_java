import java.util.Scanner;

public class Ejemplo9 {
    public static void main(String[] args) {
        // entrada estandard stdi standard input
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = teclado.nextInt();
        System.out.println("Tu edad es: "+edad);

        System.out.println("Ingersa tu nombre: ");
        String nombre = teclado.next();
        System.out.println("Tu nombre es: "+nombre);

        System.out.println("Ingersa tu estatura: ");
        double estatura = teclado.nextDouble();
        System.out.println("Tu estatura es: "+estatura);

        //salida estandard stdo , standard output
        System.out.println("hola mundo");
    }
}
