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
public class ejercicio6 {
    
    
    public static double acceso_por_indice (double [] v, int j)
throws RuntimeException{
        

if (!((0 <= j) && (j<= v.length))){


throw new RuntimeException ("El indice " + j + " no existe en el vector");
}

return v[j];
    }
// Desde el siguiente cliente “main”:
public static void main(String [] args){
double [] v = new double [15];
acceso_por_indice (v, 16);
}
}
