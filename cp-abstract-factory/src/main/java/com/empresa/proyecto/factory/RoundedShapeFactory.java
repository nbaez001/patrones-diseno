package com.empresa.proyecto.factory;

import com.empresa.proyecto.inter.IShape;
import com.empresa.proyecto.inter.model.RoundedRectangle;
import com.empresa.proyecto.inter.model.RoundedSquare;

public class RoundedShapeFactory extends AbstractFactory {
	
	@Override
	public IShape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RoundedRectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new RoundedSquare();
		}
		return null;
	}
}