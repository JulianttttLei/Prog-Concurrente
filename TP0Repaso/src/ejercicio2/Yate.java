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
public class Yate extends Barco {
    
    private int potenciaCV;
    private int nroCamarote;
    
    //Cosntructor
    public Yate(String matricula, int eslora, int añoF, int potenciaCV, int nroCamarote) {
        super(matricula, eslora, añoF);
        this.potenciaCV=potenciaCV;
        this.nroCamarote=nroCamarote;
    }
    
    //Observadoras
    
    public int getPotenciaCV(){
        return potenciaCV;
    }
    
    public int getNroCamarote(){
        return nroCamarote;
    }
    
    //Modificadoras
    
    public void setPotenciaCV(int potenciaCV){
        this.potenciaCV=potenciaCV;
    }
    
    public void setNroCamarote(int nroCamarote){
        this.nroCamarote=nroCamarote;
    }
    
    @Override
    public int calculaModulo(){
        int modulo;
        modulo=potenciaCV+nroCamarote;
        return modulo;
    }
    
    
}
