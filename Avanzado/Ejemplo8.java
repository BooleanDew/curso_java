public class Ejemplo8 {
    public static void main(String[] args) {
        Pan pan1 = new Pan(100,2.5,"Con maquina");
        System.out.println(pan1.cocinar());
    }
}

// que es abstraccion
abstract class Masa {
    private double cantidadHarina;
    private String revolver;

    public Masa(double cantidadHarina, String revolver){
        this.cantidadHarina = cantidadHarina;
        this.revolver= revolver;
    }

    public double getCantidadHarina() {
        return cantidadHarina;
    }

    public void setCantidadHarina(double cantidadHarina) {
        this.cantidadHarina = cantidadHarina;
    }

    public String getRevolver() {
        return revolver;
    }

    public void setRevolver(String revolver) {
        this.revolver = revolver;
    }

     abstract String cocinar();
}

class Pan extends Masa {
    private double leche;

    public Pan(double leche, double cantidadHarina, String revolver) {
        super(cantidadHarina, revolver);
        this.leche = leche;
    }

    public double getLeche() {
        return leche;
    }

    public void setLeche(double leche) {
        this.leche = leche;
    }

    @Override
    public String cocinar(){
        return  "cocinando el pan";
    }
}
