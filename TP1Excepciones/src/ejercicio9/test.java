/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author agust
 */
public class test {
    
    public static void main(String [] args){
       
        //Creo el cliente
        Cliente c=new Cliente("charlie","Lonson","34344543");
       
        //Creo el barco de tipo velero
        Velero v=new Velero("ert-543",2,2000,4);
        Alquiler a=new Alquiler(3,v,c,10);
       //Date d= a.obtenerFechaHoy();
       // System.out.println("Veo: "+d);
     //   LocalDate today = LocalDate.now();
       // LocalDate dias = today.plusDays(10);
        //System.out.println("Vemos: "+dias);
       //boolean es;
        System.out.println("FechaIni: "+a.getFechaIni());
        System.out.println("FechaFin: "+a.getFechaFin());
       
     
        
    }
}
