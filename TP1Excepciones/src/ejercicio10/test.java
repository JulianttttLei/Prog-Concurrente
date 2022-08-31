/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author agust
 */
public class test {
    public static void main(String [] args){
        EmpresaAlimentaria a= new EmpresaAlimentaria();
        Producto p= new Producto("gaseosa","2023/08/10",56,"2022/02/13","brasil");
        a.agregarProducto(p);
        System.out.println("Vemos: "+a.productosVencidos());
    }
}
