package com.empresa.proyecto.inter.impl;

import com.empresa.proyecto.inter.IConnection;

public class ConnectionMySQL implements IConnection {

	private String host;
	private String port;
	private String username;
	private String password;

	public ConnectionMySQL() {
		this.host = "localhost";
		this.port = "3306";
		this.username = "root";
		this.password = "1234";
	}

	public void conectar() {
		System.out.println("Se conectó a MySQL");
	}

	public void desconectar() {
		System.out.println("Se desconectó de MySQL");
	}

}
