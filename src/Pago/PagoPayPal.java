/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pago;

import Connection.LogPaypal;
import Connection.LogService;
import Pago.PaymentService;

/**
 *
 * @author fioye
 */
public class PagoPayPal implements PaymentService {
    //private boolean loggedIn; //conexión a cuenta PayPal
    @Override
    public void realizarCobro(double monto){
        LogService log= new LogPaypal();
        if (!log.Loggin()){ //conexión a cuenta PayPal
            log.Loggin();
        }
        // cargar monto al medio de pago
    }

    @Override
    public void calcularImpuestosFactura() {
        //Calcular el impusto por medio de paypal
    }

    @Override
    public void generarFactura() {
        //Imprimir con los datos dl pago en paypal
    }
    
}
