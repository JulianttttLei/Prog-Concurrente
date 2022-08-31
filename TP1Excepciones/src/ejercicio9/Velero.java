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

public class Velero extends Barco {
    
    
    private int nroMastil;
    //DUDA
    //Constructor
    public Velero(String matricula, int eslora, int añoF,int nroMastil) {
        super(matricula, eslora, añoF);
        this.nroMastil=nroMastil;
        
    }
    
    public int getNroMastil(){
        return nroMastil;
    }
    
    public void setNroMastil(int nroMastil){
        this.nroMastil=nroMastil;
    }
  
    @Override 
    public int calculaModulo(){
        int modulo;
        modulo=nroMastil;
        return modulo;
    }
    
    protected int calculaCantLitros(){
        return nroMastil;
    }
    
}
