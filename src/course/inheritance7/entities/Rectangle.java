package course.inheritance7.entities;

import course.inheritance7.entities.enums.Color;

public class Rectangle extends Shape {

	private Double width;
	private Double height;

	public Rectangle() {
		super();
	}

	public Rectangle(Color color, Double with, Double height) {
		super(color);
		this.width = with;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return height * width;
	}

}
