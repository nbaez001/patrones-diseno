package com.empresa.proyecto;

import com.empresa.proyecto.inter.IConnection;

public class App {

	public static void main(String[] args) {
		ConnectionFactory connectionFactory = new ConnectionFactory();

		IConnection cx1 = connectionFactory.getConexion("MYSQL");
		cx1.conectar();
		cx1.desconectar();

		IConnection cx2 = connectionFactory.getConexion("ORACLE");
		cx2.conectar();
		cx2.desconectar();

		IConnection cx3 = connectionFactory.getConexion("POSTGRESQL");
		cx3.conectar();
		cx3.desconectar();
	}

}
