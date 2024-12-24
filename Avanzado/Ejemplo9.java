

public class Ejemplo9 {
    public static void main(String[] args) {
        Administrador adm = new Administrador("juancho");
        System.out.println(adm.getUsuario());
        System.out.println(Administracion.USUARIO);
        
    }
}

interface Administracion {
    final String USUARIO = "admin";

    public abstract String getUsuario();
    public abstract void  setUsuario(String nombre);
    
}


class Administrador  implements Administracion{
    private String nombre;
    public Administrador(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String getUsuario(){
        return this.nombre;
    }

    @Override
    public void setUsuario(String nombre){
        this.nombre = nombre;
    }
    public String getName(){
        return "";
    }

   
}

