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
public class Notificacion {
    private int tipoNotificacion;
    public void notificar(Pago pago){
        if(tipoNotificacion==1){
            //enviarEmail();
        }
        else{
            //enviarSMS();
        }
    }
}
