package triangulitos;

import exceptions.InvalidTriangleException;
import exceptions.ScaleException;
import interfaces.Shape;

/**
 * Base class for the triangles
 */
public abstract class Triangle implements Shape {
	protected double side1,side2,side3;
	/**
	 * 
	 * @param side1 > 0
	 * @param side2 > 0
	 * @param side3 > 0
	 * @throws Exception
	 */
	public Triangle (double side1, double side2, double side3) throws Exception {
		if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
			throw new InvalidTriangleException("Invalid triangle exception");
		}
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	/**
	 * calculate the perimeter of the triangle
	 */
	public double calculatePerimeter(){
		return side1+side2+side3;
	}
	/**
	 * calculate the area of the triangle
	 */
	public abstract double calculateArea();
	
	/**
	 * scale the sides of the triangle by a factor
	 * @param scaleFactor > 0
	 */
	public void scale(double scaleFactor) throws ScaleException{
		if(scaleFactor <= 0) {
			throw new ScaleException("the scale factor has to be bigger than 0");
		}
		this.side1 = side1*scaleFactor;
		this.side2 = side2*scaleFactor;
		this.side3 = side3*scaleFactor;
	}
	
	/**
	 * Classify the triangle and return a string about the classification
	 * @return string
	 */
	public abstract String Classify();
}
