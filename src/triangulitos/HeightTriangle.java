/**
 * 
 */
package triangulitos;

import exceptions.InvalidHeightException;

/**
 * The class HeightTriangle is a subclass of Triangle. It is the base of all the triangle with height
 */
public abstract class HeightTriangle extends Triangle {

	protected double height;
	/**
	 * Create an instance of Height triangle
	 * @param side1 > 0
	 * @param side2 > 0
	 * @param side3 > 0
	 * @param height  > 0
	 * @throws Exception
	 */
	public HeightTriangle(double baseSide, double side2, double side3, double height) throws Exception {
		super(baseSide, side2, side3);
		if (height <= 0) {
			throw new InvalidHeightException("The height has to be haigher than 0. Height: " + height);
		}
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return (side1*height)/2;
	}

}
