package com.empresa.proyecto;

import com.empresa.proyecto.factory.AbstractFactory;
import com.empresa.proyecto.inter.IShape;
import com.empresa.proyecto.producer.FactoryProducer;

public class App {

	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		IShape shape1 = shapeFactory.getShape("RECTANGLE");
		shape1.draw();
		IShape shape2 = shapeFactory.getShape("SQUARE");
		shape2.draw();

		// Rounded
		AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
		IShape shape3 = shapeFactory1.getShape("RECTANGLE");
		shape3.draw();
		IShape shape4 = shapeFactory1.getShape("SQUARE");
		shape4.draw();
	}
}
