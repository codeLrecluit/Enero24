package ReadingServices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileReaderService implements IReadingService{
    @Override
    public ArrayList<String> Reading(String ruta) {
        File file = new File(ruta); //Creamos un objeto File y le pasamos la ruta
        String linea = null; //Solo para imprimir
        ArrayList<String> msg = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(file); //Intentamos abrir el archivo
            BufferedReader br = new BufferedReader(fr); //Cargamos el contenido
            while ((linea = br.readLine()) != null){ //Se lee linea por linea
                //System.out.println(linea);
                msg.add(linea);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return msg;
    }
}
