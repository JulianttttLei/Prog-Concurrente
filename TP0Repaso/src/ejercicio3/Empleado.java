/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author agust
 */
public abstract  class Empleado extends Persona {
    
    protected String legajo;
    protected int antiguedad;
    protected double salario;
    protected double horaTrab;

    public Empleado(String nombre, int dni, String fechaNac, String sexo,String legajo,int antiguedad,double salario,double horaTrab) {
        super(nombre, dni, fechaNac, sexo);
       // this.a = new ArrayList<>();
        this.legajo=legajo;
        this.antiguedad=antiguedad;
        this.salario=salario;
        this.horaTrab=horaTrab;
    }
    
    //Observadoras
    public String getLegajo(){
        return legajo;
    }
    
    public int getAntiguedad(){
        return antiguedad;
    }
    public double getSalario(){
        return salario;
    }
    @Override
    public boolean esEmpConAntMayor(){
        boolean esEmpAntMayor=antiguedad>10;
        return esEmpAntMayor;
    }

    /**
     *
     * @return
     */
    public String mostrarDatos(){
        String datosEmp,datos;
        datosEmp="Nombre: "+nombre+"\n"+
                  "Dni: "+dni+ "\n"+
                   "FechaNacimiento: "+fechaNacimiento+"\n"+
                   "Sexo: "+sexo+"\n"+
                   "Legajo: "+legajo+"\n"+
                   "Antiguedad: "+antiguedad+ "\n"+
                    "Salario: "+salario;
       datos=datosEmpleado();
       datosEmp=datosEmp+datos;
       return datosEmp;
    }
    
    public abstract String datosEmpleado();
   
    
   //   ArrayList<Integer> a;
    @Override
   public String obtenerLegYTitulo(String xx){
        String legajoTitulo=null;
        boolean verifica=verificaTitulo(xx);
        if(verifica){
            legajoTitulo=this.legajo;
        }
        return legajoTitulo;
      
    }
            
     public double calculaSueldoFinal(){
         double porcAnt=obtenerPorcAnt(antiguedad),adi=obtenerAdi(),sueldoFin;
         sueldoFin= (salario*porcAnt)/100 + salario +adi;   
       return sueldoFin;         
     }      
         private double obtenerPorcAnt(int antiguedad){
             double porcAnt=0;
             return porcAnt;
                   
         }   
           public abstract double obtenerAdi(); 
    
public abstract boolean verificaTitulo(String xx);
    @Override
    public double calculaSueldoFinal1(){
    double adi,valor,sueldoFin;
    adi=obtenerAdi();
    valor=cobraExtra();
    sueldoFin=valor+adi;
    return sueldoFin;
}
    public double cobraExtra(){
        double valor=0,porcAnt;
        if(horaTrab>160){
            valor=salario+(salario*5)/100;
        }
        porcAnt=obtenerPorcAnt(antiguedad);
        valor=valor+((porcAnt*salario)/100)+salario;
        return valor;
    }
}
