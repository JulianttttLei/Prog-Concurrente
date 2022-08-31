/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.io.IOException;

/**
 *
 * @author agust
 */
public class PruebaExcep {
    
    // a. Escriba un método que ingrese la edad de una persona y dispare una
  //excepción si la persona es menor de edad.
    private static int edadPersona()throws RuntimeException{
     int edad=2;
     if(edad<=17)
         throw new RuntimeException("La persona es menor de edad");
     return edad;
    }
    private static int edadPersona1(){
        int edad=13;
       
        try{
           if(edad>=18){
               return edad;
           }
           throw new RuntimeException();
           }catch(RuntimeException e){
              System.err.println("La persona es menor de edad");
            
                   
        }
     return edad;
    }
    // b. Escriba un método que ingrese un numero de la ruleta y dispare una
// excepción cuando al jugar no salga dicho número.
    private static boolean numRuleta(int numJugador) throws RuntimeException{
        int num=87;
      
        if(num!=numJugador){
         
            throw new RuntimeException("No salio el numero: "+num);
        }
        return true; //DEBE RETORNARR ALGO?? 
        
        
    }
    // c. Escriba un método en el que se pida ingresar 5 números a una colección y al
       //mostrarlos, trate de mostrar 7 valores de la misma, generando una excepción
    private static boolean muestra7Valores() throws RuntimeException{
        int num[]= new int[5];
        num[0]=5;
        num[1]=10;
        num[2]=15;
        num[3]=20;
        num[4]=25;
        if(num.length!=7){
            throw new RuntimeException("No tiene 7 valores");
        
        
        
        
    }
        return true;
    }
         
            
            public static void main(String [ ] args){
               
                edadPersona1();
              //  System.out.println(numRuleta(87));
                 //   muestra7Valores();
                }
    }

