public class Ejemplo3 {
    public static void main(String[] args) {
        // estructuras de datos
        // array estaticos
        // coleciones o array dinamicos
        // byte, short, int, long, float, double
        // indices son: 0,n...
        int[] edades = new int[4];// 0,1,2,3
        edades[3] = 23;
        System.out.println(edades[3]);
        char[] vocales =  {'a','e','i','o','u'};
        vocales[1] = '-';
        System.out.println(vocales[1]);

        // clases wrapper
        String[] nombres = new String[3];
        nombres[0] = "MAria";
        String[] apellidos = {"Vargas","Montes"};
        System.out.println(apellidos[1]);

        int[] numeros = {33,5,2,3,7,8,9,0};
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==0){
                System.out.println("El numero "+numeros[i]+" es par.");
            }
        }

        



    }
}
