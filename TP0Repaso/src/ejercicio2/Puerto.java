 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author agust
 */
public class Puerto {
    
    private  int valor=200;
    private int cantAlq;

    private int tamAlq=1;
    
    private Alquiler[] colAlquileres;
  
    
    //Constructor vacio
    public Puerto(){
        this.colAlquileres=new Alquiler[tamAlq];
       
        this.cantAlq=0;

    }
    
    public boolean agregarAlquiler(Alquiler alq){
        boolean exito=false;
        if(this.cantAlq<this.tamAlq){
            exito=true;
            this.colAlquileres[cantAlq]=alq;
            this.cantAlq++;
            
        }
        return exito;
    }
    
    public int getValor(){
        return valor;
    }
    
    public void setValor(int unValor){
        this.valor=unValor;
    }
    
    
    
   
    
   
}
