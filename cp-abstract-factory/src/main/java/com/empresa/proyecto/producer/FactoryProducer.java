package com.empresa.proyecto.producer;

import com.empresa.proyecto.factory.AbstractFactory;
import com.empresa.proyecto.factory.RoundedShapeFactory;
import com.empresa.proyecto.factory.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return new RoundedShapeFactory();
		} else {
			return new ShapeFactory();
		}
	}
}
