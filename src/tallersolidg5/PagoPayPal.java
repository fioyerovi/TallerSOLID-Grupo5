/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tallersolidg5;

/**
 *
 * @author fioye
 */
public class PagoPayPal extends Pago {
    private boolean loggedIn; //conexión a cuenta PayPal
    @Override
    public void realizarCobro(double monto){
        if (!loggedIn){
            return;
        }
        // cargar monto al medio de pago
    }
}
