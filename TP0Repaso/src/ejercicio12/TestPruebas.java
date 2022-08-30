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
public class TestPruebas {
   public static void main(String[] args) {
PruebaUno aux[]= new PruebaUno[3];
aux[0]= new PruebaUno(4);
aux[1]= new RedefinicionUno(4);
aux[2]= new PruebaUno(14);
for ( PruebaUno elem: aux)
System.out.println(elem.aCadena());
RedefinicionUno e= (RedefinicionUno) aux[1];
System.out.println(e.aCadena2());
}
}
