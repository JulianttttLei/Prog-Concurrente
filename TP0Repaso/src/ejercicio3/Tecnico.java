/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Objects;

/**
 *
 * @author agust
 */
public class Tecnico extends Empleado{
    
    private String titulo;
    private int añoTitulo;
    private double adiT;

    public Tecnico(String nombre, int dni, String fechaNac, String sexo, String legajo, int antiguedad,double salario,double horaTrab,String titulo, int añoTitulo,double adiT) {
        super(nombre, dni, fechaNac, sexo, legajo, antiguedad,salario,horaTrab);
        this.titulo=titulo;
        this.añoTitulo=añoTitulo;
        this.adiT=adiT;
    }
    public String getTitulo(){
        return titulo;
    }
    
    public int getAñoTitulo(){
        return añoTitulo;
    }
public double getAdiT(){
    return adiT;
}
    @Override
    public String datosEmpleado(){
        String datos;
        datos="Titulo: "+titulo+"\n"+
               "añoTitulo: "+añoTitulo+"\n"+
                "adiccional: "+adiT;
        return datos;
        
    }

    

   
    @Override
  public boolean verificaTitulo(String xx){
      boolean verifica= (this.titulo.equals(xx));
      return verifica;
  }
    @Override
   public  double obtenerAdi(){
       double adi=adiT;
       return adi;
   }
    
    
    
}
