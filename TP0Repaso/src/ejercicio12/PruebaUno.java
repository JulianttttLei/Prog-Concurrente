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
public class PruebaUno {
    protected int temp;
public PruebaUno(int valor) {
temp = valor;
}
public void cambiar(int valor){
    temp = valor;
}
public String aCadena(){
return "estoy en la superclase con valor " + temp;
}
}

