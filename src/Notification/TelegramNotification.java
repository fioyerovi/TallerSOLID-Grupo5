/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notification;

import Pago.PaymentService;

/**
 *
 * @author tagoa
 */
public class TelegramNotification implements NotificationService{

    @Override
    public void notificar(PaymentService pago) {
        //Notificar al telegram del cliente
    }
    
}
