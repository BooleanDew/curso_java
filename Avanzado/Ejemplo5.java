public class Ejemplo5 {
    public static void main(String[] args) {
        // objetos
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.setNombre("Jose");
        System.out.println(p1.getNombre());

        p2.setNombre("Marcia");
        System.out.println(p2.getNombre());

    }
}

 class Persona{
    private String nombre;
    private int edad;
    
    public Persona(){

    }

    public Persona(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
