public class Ejemplo6 {
    public static void main(String[] args) {
        
        String n = "hola";
        // funciones puras toUpperCase()
        System.out.println(n.toUpperCase());

        // funciones impuras
        saludar();
    }

    public static void saludar(){
        System.out.println("hola que tal");
    }
}
