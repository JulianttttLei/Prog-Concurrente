/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author agust
 */
public class EmpresaAlimentaria {
    private Producto colProducto[];
    private int cantProducto;
    private int tamProducto=1;
    
    public EmpresaAlimentaria(){
        this.colProducto=new Producto[tamProducto];
        this.cantProducto=0;
        
    }
    public boolean agregarProducto(Producto produc){
        boolean exito=false;
        if(this.cantProducto<this.tamProducto){
            exito=true;
            this.colProducto[cantProducto]=produc;
            this.cantProducto++;
            
        }
        return exito;
    }
    public ArrayList productosVencidos(){
     int p;
     ArrayList <Producto>colProdVenc=new ArrayList<Producto>();
          for(p=0;p<this.colProducto.length;p++){ 
          LocalDate today = LocalDate.now();
           DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("yyyy/MM/dd");
           String hoy= today.format(dtf);
              System.out.println("Hoy: "+hoy);
              try{
         if((this.colProducto[p].getFechaCaducidad()).compareTo(hoy)>0){
            
             colProdVenc.add(this.colProducto[p]);//cuando se imprime es raro
         }else{
              throw new RuntimeException();
         }
              }catch(RuntimeException e){
                  System.err.println("Producto Vencido");
                  e.printStackTrace();
              }
     }
          return colProdVenc;
    }
}
