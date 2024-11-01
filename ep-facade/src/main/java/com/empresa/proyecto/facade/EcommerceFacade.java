package com.empresa.proyecto.facade;

import com.empresa.proyecto.facade.service.EnvioService;
import com.empresa.proyecto.facade.service.InventarioService;
import com.empresa.proyecto.facade.service.NotificacionService;
import com.empresa.proyecto.facade.service.PagoService;

public class EcommerceFacade {
    private InventarioService inventarioService;
    private PagoService pagoService;
    private EnvioService envioService;
    private NotificacionService notificacionService;

    public EcommerceFacade() {
        this.inventarioService = new InventarioService();
        this.pagoService = new PagoService();
        this.envioService = new EnvioService();
        this.notificacionService = new NotificacionService();
    }

    public void realizarPedido(String itemId, String detallesPago, String direccion) {
        System.out.println("Procesando pedido...");

        // Paso 1: Verificar inventario
        if (!inventarioService.verificarStock(itemId)) {
            System.out.println("El artículo está agotado.");
            return;
        }
        inventarioService.reservarArticulo(itemId);

        // Paso 2: Procesar pago
        if (!pagoService.procesarPago(detallesPago)) {
            System.out.println("El pago ha fallado.");
            return;
        }

        // Paso 3: Crear envío
        String envioId = envioService.crearEnvio(itemId, direccion);
        System.out.println("Envío creado con ID: " + envioId);

        // Paso 4: Enviar confirmación de pedido
        notificacionService.enviarConfirmacionPedido(envioId);

        System.out.println("¡Pedido realizado con éxito!");
    }
}