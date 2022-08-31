 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author agust
 */
public class Puerto {
    
    private  int valor=200;
    private int cantAlq;

    private int tamAlq=1;
    
    private Alquiler[] colAlquileres;
    private final int limite;
  
    
    //Constructor vacio
    public Puerto(int limite){
        this.colAlquileres=new Alquiler[tamAlq];
       this.limite=limite;
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
    public int getLimite(){
        return limite;
    }
    public int getValor(){
        return valor;
    }
    
    public void setValor(int unValor){
        this.valor=unValor;
    }
    
    public void registrarAlquiler(int nroAmarre,Barco unBarco,Cliente unCliente, int cantDias){
      boolean supera;
      supera=ExcepcionDias.excepcionDiasAux(this, cantDias);
      if(supera){
         Alquiler alq=new Alquiler(nroAmarre,unBarco,unCliente,cantDias);
         this.colAlquileres[this.cantAlq]=alq;
         this.cantAlq++;
      }
     
    }
    
   
    
   
}
