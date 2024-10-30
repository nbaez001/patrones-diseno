package com.empresa.proyecto;

import com.empresa.proyecto.inter.Tarjeta;
import com.empresa.proyecto.inter.TarjetaCredito;
import com.empresa.proyecto.inter.TarjetaDebito;

import java.util.ArrayList;
import java.util.List;

public class App {
    public void businessLogic() {
        List<Tarjeta> tarjetas = new ArrayList<>();

        TarjetaCredito tarjetaCredito = new TarjetaCredito();
        tarjetaCredito.setTitular("Juan Pérez");
        tarjetaCredito.setNumero("1234-5678-9876-5432");
        tarjetaCredito.setFechaExpiracion("12/25");
        tarjetaCredito.setLimiteCredito(10000);
        tarjetas.add(tarjetaCredito);

        TarjetaDebito tarjetaDebito = new TarjetaDebito();
        tarjetaDebito.setTitular("Ana Gómez");
        tarjetaDebito.setNumero("8765-4321-1234-5678");
        tarjetaDebito.setFechaExpiracion("08/24");
        tarjetaDebito.setSaldoDisponible(5000);
        tarjetas.add(tarjetaDebito);

        List<Tarjeta> tarjetasCopia = new ArrayList<>();
        for (Tarjeta tarjeta : tarjetas) {
            tarjetasCopia.add(tarjeta);
            tarjetasCopia.add(tarjeta.clonar());
        }

        for (Tarjeta tarjeta : tarjetasCopia) {
            tarjeta.mostrarInformacion();
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.businessLogic();
    }
}
