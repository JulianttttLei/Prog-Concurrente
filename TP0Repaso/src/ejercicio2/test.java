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
public class test {
    
    public static void main(String [] args){
        
        //Creo el cliente
        Cliente c=new Cliente("charlie","Lonson","34344543");
       
        //Creo el barco de tipo velero
        Velero v=new Velero("ert-543",2,2000,4);
        Alquiler a=new Alquiler(c,"2022-12-23","2021-04-12",4,v);
        Puerto p=new Puerto();
       boolean es;
       
       es=p.agregarAlquiler(a);
        System.out.println("Es: "+es);
        
    }
}
