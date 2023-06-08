package com.empresa.proyecto;

import com.empresa.proyecto.inter.IConnection;
import com.empresa.proyecto.inter.impl.ConnectionMySQL;
import com.empresa.proyecto.inter.impl.ConnectionOracle;
import com.empresa.proyecto.inter.impl.ConnectionPostgreSQL;

public class ConnectionFactory {

	public IConnection getConexion(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase("MYSQL")) {
			return new ConnectionMySQL();
		} else if (shapeType.equalsIgnoreCase("ORACLE")) {
			return new ConnectionOracle();
		} else if (shapeType.equalsIgnoreCase("POSTGRESQL")) {
			return new ConnectionPostgreSQL();
		}

		return null;
	}
}
