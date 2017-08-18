/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonExercise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author personal
 */
public class Reloj
{
    private static Reloj instance;

        private Reloj(){

        }

        private String fecha;
        private String hora;
        
    public static Reloj getInstance()
    {
        if(instance == null) //comprobar si instance existe, y si no, se crea. Si existe, se regresa.
        {
            instance = new Reloj();
        }
        return instance;
    }    
    /*public String setHora(){
        
    } */
    public String getFecha() 
    {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");     
        Date today = Calendar.getInstance().getTime();        
        String reportDate = df.format(today);
        System.out.println(reportDate);
        return reportDate;
    }
    
    
    
    public static void main(String[]args){
        Reloj reloj1 = new Reloj();
        reloj1.getFecha();
    }
}    
    /*public String setHora(){
        DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
        String hourFormat1 = hourFormat.toString();
        
        return hourFormat1;
    }
    public static void main(String[]args){
        Reloj instancia1 = Reloj.getInstance();
        System.out.println(instancia1.setHora());
    }
}    8/
   
    
    
    /*public class FechaHora {
        public static void main(String[] args) {
            Date date = new Date();
            //Caso 1: obtener la hora y salida por pantalla con formato:
            DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");
            System.out.println("Hora: "+hourFormat.format(date));
            //Caso 2: obtener la fecha y salida por pantalla con formato:
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Fecha: "+dateFormat.format(date));
            //Caso 3: obtenerhora y fecha y salida por pantalla con formato:
            DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            System.out.println("Hora y fecha: "+hourdateFormat.format(date));
    }
}
    };
}
*/