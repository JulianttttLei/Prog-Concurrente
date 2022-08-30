/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author agust
 */
public class RedefinicionUno extends PruebaUno{
    
   private int temp2;
public RedefinicionUno(int valor){
super(valor);
temp2 = valor * 7;
}
   @Override
   public String aCadena(){
return "ahora estoy en la subclase con valor: " + temp ;
}
public String aCadena2() {
return "en la subclase con valor: " + temp2;
}
    
}
