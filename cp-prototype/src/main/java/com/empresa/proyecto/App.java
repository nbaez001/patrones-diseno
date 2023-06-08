package com.empresa.proyecto;

import com.empresa.proyecto.cache.ShapeCache;
import com.empresa.proyecto.inter.Circle;
import com.empresa.proyecto.inter.Shape;

public class App {
	public static void main(String[] args) {
		ShapeCache.loadCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());

		// Example withou cache
		Circle circle = new Circle();
		circle.setId("1");
		System.out.println("Shape : " + circle.getType());

		Circle circle2 = (Circle) circle.clone();
		System.out.println("Shape : " + circle2.getType());

		Circle circle3 = circle;

		System.out.println(circle == circle2);
		System.out.println(circle == circle3);
	}
}
