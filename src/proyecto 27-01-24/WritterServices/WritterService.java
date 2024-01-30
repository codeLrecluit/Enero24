package WritterServices;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class WritterService implements IWritterServices{
    @Override
    public void Writter(String ruta, String[] fechas) {
        File file = new File(ruta); //Creamos un objeto File y le pasamos la ruta
        String linea = null; //Solo para imprimir
        try {
            FileWriter fw = new FileWriter(ruta, true); //el para que se escriba al final agregandolo
                                                                //si es false lo remplanza.
            //fw.write(msg);
            for (String fecha: fechas) {
                fw.write(fecha+" \n");
            }
            fw.close();//Cierra el Archivo
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
