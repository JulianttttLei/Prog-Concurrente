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
public class ProductoRefrigerado extends ProductoCongelado {
    private final String codOrganismo;
    
    public ProductoRefrigerado(String denominacion, String fechaCaducidad, int nroLote, String fechaEnvasado, String paisOrigen, double tempMantenimiento, String codOrganismo) {
        super(denominacion, fechaCaducidad, nroLote, fechaEnvasado, paisOrigen, tempMantenimiento);
        this.codOrganismo=codOrganismo;
    }
    public String getCodOrganismo(){
        return codOrganismo;
    }
    
}
