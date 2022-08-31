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
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String dni;
    
    public Cliente(String nombre, String apellido, String dni){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dni=dni;
        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getDni(){
        return dni;
    }
    
    
}
