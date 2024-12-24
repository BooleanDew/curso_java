import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        // continuacion de arreglos estaticos.
        Scanner teclado = new Scanner(System.in);
        int[] edades = new int[5];
        for(int i=0; i<edades.length; i++){//i=0
            System.out.println("Ingrese valor para el indice:"+i);//0
            edades[i]= teclado.nextInt();//edades[0] = 2
        }

        for(int j=0; j<edades.length; j++){
            System.out.println(edades[j]);
        }
        


    }
}
