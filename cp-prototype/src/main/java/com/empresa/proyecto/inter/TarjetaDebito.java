package com.empresa.proyecto.inter;

public class TarjetaDebito extends Tarjeta {
    private double saldoDisponible;

    public TarjetaDebito() {
    }

    public TarjetaDebito(TarjetaDebito source) {
        super(source);
        if (source != null) {
            this.saldoDisponible = source.saldoDisponible;
        }
    }

    @Override
    public Tarjeta clonar() {
        return new TarjetaDebito(this);
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Saldo Disponible: " + saldoDisponible);
    }
}