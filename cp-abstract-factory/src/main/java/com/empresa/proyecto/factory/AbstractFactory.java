package com.empresa.proyecto.factory;

import com.empresa.proyecto.inter.IShape;

public abstract class AbstractFactory {

	public abstract IShape getShape(String shapeType);
}
