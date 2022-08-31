/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author agust
 */
public class Producto {
    
    protected String denominacion;
    protected String fechaCaducidad;
    protected int nroLote;
    protected String fechaEnvasado;
    protected String paisOrigen;
    
    public Producto(String denominacion, String fechaCaducidad,int nroLote,String fechaEnvasado,String paisOrigen){
        this.denominacion=denominacion;
        this.fechaCaducidad=fechaCaducidad;
        this.nroLote=nroLote;
        this.fechaEnvasado=fechaEnvasado;
        this.paisOrigen=paisOrigen;
    }
    
    public String getDenominacion()
    {
      return denominacion;
    }

    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    
    public int getNroLote(){
        return nroLote;
    }
    
    public String getFechaEnvasado(){
        return fechaEnvasado;
    }
    
    public String getPaisOrigen(){
        return paisOrigen;
    }
    
    

}
