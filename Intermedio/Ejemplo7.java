import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ejemplo7 {
    public static void main(String[] args) {
        // manipulacion de archivos == gestion de documentos o archivos.
        try{
            File archivo = new File("documento.txt");
            if(!archivo.exists()){
                // crear un archivo
                archivo.createNewFile();
            }
            
            // Escribir en el archivo.
            BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));
            escribir.write("hola soy un dato escrito");
            escribir.close();

            // Leer el archivo.
            BufferedReader leer = new BufferedReader(new FileReader(archivo));
            String lineaLeida = "";
            while ((lineaLeida=leer.readLine())!=null) {
                System.out.println("Linea Leida: "+lineaLeida);
            }

            leer.close();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
