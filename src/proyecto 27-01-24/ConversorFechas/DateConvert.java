package ConversorFechas;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class DateConvert {

    public String[] handler(ArrayList<String> fechas){
        String[] result = new String[fechas.toArray().length];
        int iterador = 0;
        for(String fecha : fechas){
            String diaStr = fecha.substring(0, 2);
            String mesStr = fecha.substring(2, 4);
            String yearStr = fecha.substring(4, 8);
            result[iterador]=Conversion(diaStr, mesStr, yearStr);
            iterador++;
        }
        return result;
    }

    private String Conversion(String dia, String mes, String year){
        String[] numeros = {
                "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez",
                "Once", "Doce", "Trece", "Catorce", "Quince", "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve", "Veinte",
                "Veintiuno", "Veintidós", "Veintitrés", "Veinticuatro", "Veinticinco", "Veintiséis", "Veintisiete", "Veintiocho", "Veintinueve", "Treinta",
                "Treinta y uno"
        };

        int diaNum = Integer.parseInt(dia);
        String msg = numeros[diaNum-1] + " de ";
        switch (mes){
            case "01":
                msg +="Enero";
                break;
            case "02":
                msg +="Febrero";
                break;
            case "03":
                msg +="Marzo";
                break;
            case "04":
                msg +="Abril";
                break;
            case "05":
                msg +="Mayo";
                break;
            case "06":
                msg +="Junio";
                break;
            case "07":
                msg +="Julio";
                break;
            case "08":
                msg +="Agosto";
                break;
            case "09":
                msg +="Septiembre";
                break;
            case "10":
                msg +="Octubre";
                break;
            case "11":
                msg +="Noviembre";
                break;
            case "12":
                msg +="Diciembre";
                break;

        }
        msg += " del "+year;
        return msg;
    }
}
