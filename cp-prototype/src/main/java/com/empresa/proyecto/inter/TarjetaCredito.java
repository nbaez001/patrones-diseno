package com.empresa.proyecto.inter;

public class TarjetaCredito extends Tarjeta {
    private double limiteCredito;

    public TarjetaCredito() {
    }

    public TarjetaCredito(TarjetaCredito source) {
        super(source);
        if (source != null) {
            this.limiteCredito = source.limiteCredito;
        }
    }

    @Override
    public Tarjeta clonar() {
        return new TarjetaCredito(this);
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Límite de Crédito: " + limiteCredito);
    }
}