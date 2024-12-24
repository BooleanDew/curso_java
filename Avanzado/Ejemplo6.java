public class Ejemplo6 {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Vistury", "Anibal", 102);
        
        System.out.println("El doctor tiene "+doc1.getEdad()+" años de edad");

       
    }
}

// clase padre == superclase
class Persona {
    // atributos comunes
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

// herencia
// clase hija == subclase
class Doctor extends Persona {
    private String lenguajeMedico;

    public Doctor(String lenguajeMedico, String nombre, int edad) {
        super(nombre, edad);
        this.lenguajeMedico = lenguajeMedico;
    }

    public String getLenguajeMedico() {
        return lenguajeMedico;
    }

    public void setLenguajeMedico(String lenguajeMedico) {
        this.lenguajeMedico = lenguajeMedico;
    }
}
