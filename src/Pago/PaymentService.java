/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pago;

/**
 *
 * @author fioye
 */
public interface PaymentService {
    //atributos
    public void realizarCobro(double monto);//cargar monto de compra 
    
    public void calcularImpuestosFactura();//calcula impuestos de compra
    
    public void generarFactura();//genera nueva factura
        
    
}
