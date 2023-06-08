package com.empresa.proyecto.factory;

import com.empresa.proyecto.inter.IShape;
import com.empresa.proyecto.inter.impl.Rectangle;
import com.empresa.proyecto.inter.impl.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}
}
