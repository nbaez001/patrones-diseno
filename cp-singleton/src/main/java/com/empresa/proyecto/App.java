package com.empresa.proyecto;

public class App {

	public static void main(String[] args) {
		Conexion conexion = Conexion.obtenerInstancia();

		conexion.conectar();
		conexion.desconectar();
	}
}
