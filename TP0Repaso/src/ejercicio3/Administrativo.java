/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author agust
 */
public class Administrativo extends Empleado {
    
    private String categoria;
    private double adiA;
    
    public Administrativo(String nombre, int dni, String fechaNac, String sexo, String legajo, int antiguedad,double salario,double horaTrab, String categoria,double adiA){
         super(nombre, dni, fechaNac, sexo, legajo, antiguedad,salario,horaTrab);
         this.categoria=categoria;
         this.adiA=adiA;
         
    }
    
    public String getCategoria(){
        return categoria;
    }
    public double getAdiA(){
        return adiA;
    }
    
    public void setCategoria(String categoria){
        this.categoria=categoria;
    }
    
    @Override
    public String datosEmpleado(){
        String datos;
        datos="Categoria "+categoria+"\n"+
               "Adiccional: "+adiA;
        return datos;
                }

 
    @Override
    public double obtenerAdi(){
     double adi=adiA;
return adi;
}
    @Override
    public boolean verificaTitulo(String xx){
        boolean verifica=false;
        return verifica;
        
    }
}