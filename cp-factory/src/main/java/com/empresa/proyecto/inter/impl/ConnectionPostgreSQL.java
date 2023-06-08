package com.empresa.proyecto.inter.impl;

import com.empresa.proyecto.inter.IConnection;

public class ConnectionPostgreSQL implements IConnection {

	private String host;
	private String port;
	private String username;
	private String password;

	public ConnectionPostgreSQL() {
		this.host = "localhost";
		this.port = "1433";
		this.username = "postgres";
		this.password = "1234";
	}

	public void conectar() {
		System.out.println("Se conectó a PostgreSQL");
	}

	public void desconectar() {
		System.out.println("Se desconectó de PostgreSQL");
	}

}
