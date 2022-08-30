/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author agust
 */

    public class RedefinicionStatic extends PruebaStatic {
        
        public static void main(String [] args){
            System.out.println(aCadena());
            
        } 
public static String aCadena(){
return PruebaStatic.aCadena() + "estoy en la subclase" ;
}
}
