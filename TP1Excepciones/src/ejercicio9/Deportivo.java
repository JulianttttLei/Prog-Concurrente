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
public class Deportivo extends Barco {
    
    private int potenciaCV;

    public Deportivo(String matricula, int eslora, int añoF, int potenciaCV) {
        super(matricula, eslora, añoF);
        this.potenciaCV=potenciaCV;
    }
    //Observador
    public int getPotenciaCV(){
        return potenciaCV;
    }
    
    //Modificador
    public void setPotenciaCV(int potenciaCV){
        this.potenciaCV=potenciaCV;
    }

    @Override
    public int calculaModulo() {
       int modulo;
       modulo=potenciaCV;
       return modulo;
    }
    
    
}
