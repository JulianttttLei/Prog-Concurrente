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
public abstract class  Persona {
    
    protected String nombre;
    protected int dni;
    protected String fechaNacimiento;
    protected String sexo;
    
    public Persona(String nombre, int dni, String fechaNac, String sexo){
        this.nombre=nombre;
        this.dni=dni;
        this.fechaNacimiento=fechaNac;
        this.sexo=sexo;
    }
    
    //Observadoras
    public String getNombre(){
        return nombre;
        
    }
    
    public int getDni(){
        return dni;
    }
    
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
    
    public String getSexo(){
        return sexo;
    }
     public abstract boolean esEmpConAntMayor();
   public abstract double calculaSueldoFinal1();
    public abstract String mostrarDatos();
    public abstract String obtenerLegYTitulo(String xx);
}
