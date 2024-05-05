package triangulitos;

public class Scalene extends Triangle {
	private double base;
	private double height;
	/**
	 * Constructor
	 * @param height
	 * @param base
	 * @param side2
	 * @throws Exception
	 */
	public Scalene(double height, double base, double side2) throws Exception {
		super(base, side2, height);
		this.base=base;
		this.height = height;
	}
	@Override
	public String Classify() {
		if (side1 != side2 && side2!=side3 && side1!=side3) {
			return "Triangle is Scalene";
		}
		else {
			return "Triangle is not scalene";
		}
	}
	@Override
	public String toString() {
		return Classify();
	}
	@Override
	public double calculateArea(){
		return (base*height)/2; // Esto esta mal

	} 

}
