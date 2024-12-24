import java.util.ArrayList;

public class Ejemplo5 {
    public static void main(String[] args) {
        // coleciones
        ArrayList<String> nombres = new ArrayList<>();// [] == ()
        nombres.add("jose");//0
        nombres.add("maria");//1
        nombres.add("daniela");//2
        nombres.add("evaristo");//3
        System.out.println(nombres.get(2));
        nombres.set(2,"juana");
        System.out.println(nombres.get(2));
        for(String s : nombres){
            System.out.println(s);
        }
    }
}
