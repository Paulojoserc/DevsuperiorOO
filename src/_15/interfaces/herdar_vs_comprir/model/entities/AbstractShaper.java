package _15.interfaces.herdar_vs_comprir.model.entities;

import _15.interfaces.herdar_vs_comprir.model.entities.enums.Color;

public abstract class AbstractShaper implements Shape {
	private Color color;

	public AbstractShaper() {
		
	}
	public AbstractShaper(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
