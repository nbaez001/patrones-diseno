package com.empresa.proyecto.inter.impl;

import com.empresa.proyecto.inter.IConnection;

public class ConnectionOracle implements IConnection {

	private String host;
	private String port;
	private String username;
	private String password;

	public ConnectionOracle() {
		this.host = "localhost";
		this.port = "1521";
		this.username = "orcl";
		this.password = "1234";
	}

	public void conectar() {
		System.out.println("Se conectó a Oracle");
	}

	public void desconectar() {
		System.out.println("Se desconectó de Oracle");
	}

}
