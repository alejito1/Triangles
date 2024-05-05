package cuadrilaterals;

import exceptions.SideException;

public class Square extends Rectangle {
	private double edge;
	public Square (double edge) throws Exception {
		super (edge, edge);
		if (edge <= 0){
			throw new SideException ("Cannnot create square, sides are less than zero");
		}
		this.edge =edge;
	}
	public double calculateArea() {
		return edge*edge;
	}
	@Override
	public String toString() {
		return "Square [edge=" + edge + ", calculateArea()=" + calculateArea() + "]";
	}

}
