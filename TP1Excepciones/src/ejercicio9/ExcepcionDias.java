/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author agust
 */
public class ExcepcionDias {
    public static void main(String []args){
    }
        public static boolean excepcionDiasAux(Puerto unPuerto,int cantDias) throws RuntimeException{
            int limite= unPuerto.getLimite();
            if(cantDias>limite){
               throw new RuntimeException(); 
            }
            return true;
        }
    }

