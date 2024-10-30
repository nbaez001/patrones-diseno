package com.empresa.proyecto.inter.model;

public class Manual {
    private String detallesProcesador;
    private String detallesRAM;
    private String detallesAlmacenamiento;
    private String detallesTarjetaGrafica;
    private String detallesWiFi;

    public void setDetallesProcesador(String detallesProcesador) {
        this.detallesProcesador = detallesProcesador;
    }

    public void setDetallesRAM(String detallesRAM) {
        this.detallesRAM = detallesRAM;
    }

    public void setDetallesAlmacenamiento(String detallesAlmacenamiento) {
        this.detallesAlmacenamiento = detallesAlmacenamiento;
    }

    public void setDetallesTarjetaGrafica(String detallesTarjetaGrafica) {
        this.detallesTarjetaGrafica = detallesTarjetaGrafica;
    }

    public void setDetallesWiFi(String detallesWiFi) {
        this.detallesWiFi = detallesWiFi;
    }

    @Override
    public String toString() {
        return "Manual [detallesProcesador=" + detallesProcesador + ", detallesRAM=" + detallesRAM + ", detallesAlmacenamiento=" + detallesAlmacenamiento + ", detallesTarjetaGrafica=" + detallesTarjetaGrafica + ", detallesWiFi=" + detallesWiFi + "]";
    }
}
