public class Ejemplo7 {
    public static void main(String[] args) {
        Vehiculo v1 = new VehiculoDeportivo(true, "ferrari");
        v1.desplasandoce();
    }
}

class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void desplasandoce() {
        System.out.println("Vehiculo desplazandoce ");
    }

}

class VehiculoDeportivo extends Vehiculo {
    private boolean aleron;

    public VehiculoDeportivo(boolean aleron, String marca) {
        super(marca);
        this.aleron = aleron;
    }

    public boolean isAleron() {
        return aleron;
    }

    public void setAleron(boolean aleron) {
        this.aleron = aleron;
    }

    public void desplasandoce() {
        System.out.println("hola");
    }
}
