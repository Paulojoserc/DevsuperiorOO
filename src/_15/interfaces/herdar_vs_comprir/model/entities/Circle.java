package _15.interfaces.herdar_vs_comprir.model.entities;

import _15.interfaces.herdar_vs_comprir.model.entities.enums.Color;

public class Circle extends AbstractShaper {
	private Double radius;

	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}


	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
