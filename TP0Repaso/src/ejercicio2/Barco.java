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
public abstract class Barco {
    
    protected String matricula;
    protected int eslora;
    protected int añoFabricacion;
    
    public Barco(String matricula, int eslora, int añoF){
        this.matricula=matricula;
        this.eslora=eslora;
        this.añoFabricacion=añoF;
        
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public int getEslora(){
        return eslora;
        
    }
    public int getAñoFabricacion(){
        return añoFabricacion;
    }
    
    public void setEslora(int eslora){
        this.eslora=eslora;
    }
    public double calculaCostoAlq(Puerto unPuerto, double dias){
        int valor;
        double costoAlq,modulo;
        valor=unPuerto.getValor();
        costoAlq=dias*(10*eslora)+valor;
        modulo= calculaModulo();
        costoAlq=costoAlq+modulo;
        return costoAlq;
    }
    //METODO ABSTRACTO: No se implementa en la clase padre pero si en sus clase hijas
   public abstract int calculaModulo();
}
