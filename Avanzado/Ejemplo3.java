public class Ejemplo3 {
    public static void main(String[] args) {
        
    }
}

class Persona{
    //atributo
    String nombre;

    //metodo
    public void hablar(){
        System.out.println("persona hablando...");
    }
}

class Vehiculo{
    double cilindrada;

    //metodos
    public void mover(){
        System.out.println("el vehiculo se esta moviendo...");
    }
}

class Calculadora{
    int numero1;
    int numero2;
    int resultado;

    public void sumar(int numero1, int numero2){
        // this
        this.numero1= numero1;
        this.numero2=numero2;
        this.resultado = this.numero1+this.numero2;
        System.out.println("El resultado de la suma es: "+this.resultado);
    }


}
