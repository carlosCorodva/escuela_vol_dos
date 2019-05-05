/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SE.componentes;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author Usuario
 */
public class Fecha {

    public static int compararFecha(Date fecha1, Date fecha2) {
        int val = 0;
        val = fecha1.compareTo(fecha2);

        return val;

    }

    public static Date FechaSql() {
        String dias = "" + Dia(), mes = "" + Mes();
        if (dias.length() == 1) {
            dias = "0" + dias;
        }
        if (mes.length() == 1) {
            mes = "0" + mes;
        }
        return java.sql.Date.valueOf("" + Anio() + "-" + mes + "-" + dias);
    }

    public static int Dia() {
        Calendar c1 = Calendar.getInstance();
        return c1.get(Calendar.DATE);
    }

    public static int Mes() {
        Calendar c1 = Calendar.getInstance();
        return c1.get(Calendar.MONTH) + 1;
    }

    public static int Anio() {
        Calendar c1 = Calendar.getInstance();
        return c1.get(Calendar.YEAR);
    }

    public static String getStringFecha(Date fecha) {
        if (fecha != null) {
            String cad[] = fecha.toString().split("-");
            return cad[2] + "/"
                    + getStringMes(Integer.parseInt(cad[1])) + "/" + cad[0];

        } else {
            return "";
        }
    }
    
        public static String getStringFecha1(String fecha) {
            String msg="";
        if (fecha != null) {
            String cad[] = fecha.toString().split(" ");
            msg = msg + cad[0];
//            return cad[2] + "/"
//                    + getStringMes(Integer.parseInt(cad[1])) + "/" + cad[0];
        }
       
            return msg;
       
    }

    public static String getStringMes(int mes) {
        String gui = null;
        if (mes == 1) {
            gui = "01";
        }
        if (mes == 2) {
            gui = "02";
        }
        if (mes == 3) {
            gui = "03";
        }
        if (mes == 4) {
            gui = "04";
        }
        if (mes == 5) {
            gui = "05";
        }
        if (mes == 6) {
            gui = "06";
        }
        if (mes == 7) {
            gui = "07";
        }
        if (mes == 8) {
            gui = "08";
        }
        if (mes == 9) {
            gui = "09";
        }
        if (mes == 10) {
            gui = "10";
        }
        if (mes == 11) {
            gui = "11";
        }
        if (mes == 12) {
            gui = "12";
        }
        return gui;
    }
}
