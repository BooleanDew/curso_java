import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        //parametros y argumnetos
        // parametro = el nombe de la variable con su tipo de dato, Ej: int edad
        // argumento = valor literal o valor de la variables, Ej 23
       
        while (true) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Menu Principal:\n1-Sumar");
            System.out.println("Ingrese una ocpcion:");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                        System.out.println("sumar");
                        System.out.println("Ingrese primer numero: ");
                        int a = teclado.nextInt();
                        System.out.println("Ingrese segundo numero: ");
                        int b = teclado.nextInt();
                        suma(a,b);
                    break;
            
                default:
                    System.out.println("opcion invalida");
            }
        }
    }

    public static void suma(int a, int b){
        System.out.println("El resultado de la suma es: "+(a+b));
    }

}
