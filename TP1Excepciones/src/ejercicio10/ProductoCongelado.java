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
public class ProductoCongelado extends Producto {
    
    protected double tempMantenimiento;
    
    public ProductoCongelado(String denominacion, String fechaCaducidad, int nroLote, String fechaEnvasado, String paisOrigen,double tempMantenimiento) {
        super(denominacion, fechaCaducidad, nroLote, fechaEnvasado, paisOrigen);
        this.tempMantenimiento=tempMantenimiento;
        
    }
    public double getTempMantenimiento(){
        return tempMantenimiento;
    }
    
    
}
