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
public class Empresa {
    
    private Persona[] colPersonas;
    private int cantPers;
    private int tamPers=1;
    
    public Empresa(){
        this.colPersonas=new Persona[tamPers];
        this.cantPers=0;
    }
    
    public boolean agregarPersonas(Persona pers){
        boolean exito=false;
        if(this.cantPers<this.tamPers){
            this.colPersonas[cantPers]=pers;
            this.cantPers++;
            exito=true;
        }
        return exito;
    }
    public Persona[] getColPersonas(){
        return colPersonas;
    }
    
    public ArrayList generarColEmpAnt(){
       ArrayList <Persona>colEmpAntMayor=new ArrayList<Persona>();
       Persona persona;
        boolean esEmpAntMayor;
        int p,pos=0;
        for(p=0;p<this.colPersonas.length;p++){
           
            //como la clase Persona es abstacto entonces se lo hereda a la clase hija osea la clase Empleado
            persona=this.colPersonas[p];
            esEmpAntMayor=persona.esEmpConAntMayor();
            
            if(esEmpAntMayor){
               
                colEmpAntMayor.add(persona);
                
            }
        }
        return colEmpAntMayor;
 
    }
     public String mostrarDatosEmp(){
         String datos="",datosEmp;
         int pos;
         Persona empleado;
         for(pos=0;pos<colPersonas.length;pos++){
             empleado=this.colPersonas[pos];
             datosEmp=empleado.mostrarDatos();
             datos=datos+datosEmp;
         }
         return datos;
         
     }
     public ArrayList generaColLeg(String xx){
         String legajoTitulo;
         ArrayList<String> colLeg;
         colLeg=new ArrayList<String>();
         int p;
         for(p=0; p<colPersonas.length;p++){
             legajoTitulo=colPersonas[p].obtenerLegYTitulo(xx);
             if(legajoTitulo!=null){
                 colLeg.add(legajoTitulo);
                
             }
         }
         return colLeg;
     }
     public ArrayList cobraMensualEmpleado1(){
         ArrayList <Double> colMesEmp;
         colMesEmp=new ArrayList<Double>();
         double sueldoFin;
         int p;
         for(p=0;p<colPersonas.length;p++){
             sueldoFin=colPersonas[p].calculaSueldoFinal1();
             colMesEmp.add(sueldoFin);
         }
         return colMesEmp;
         
    
}
}
