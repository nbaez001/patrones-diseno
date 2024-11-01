package com.empresa.proyecto.facade.service;

public class NotificacionService {
    public void enviarConfirmacionPedido(String orderId) {
        System.out.println("Confirmación de pedido enviada para el ID del pedido: " + orderId);
    }
}
