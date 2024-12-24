public class Ejemplo4 {
    public static void main(String[] args) {
        // encapsulamiento
    }
}

class Persona{
    private String nombre;

    // constructor
    public Persona(){
        
    }

    public Persona(String nombre){
        this.nombre=nombre;
    }

    //getter
    public String getNombre(){
        return this.nombre;
    }

    // setter
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
