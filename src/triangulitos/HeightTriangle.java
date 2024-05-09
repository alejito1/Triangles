/**
 * 
 */
package triangulitos;

/**
 * Base of all the triangle with height
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
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return (side1*height)/2;
	}

}
