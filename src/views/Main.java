package views;
import cuadrilaterals.*;
import exceptions.InvalidQuadrilateralException;
import triangulitos.*;
public class Main {
    public static void main(String[] args) {
        try {
            //Square s1 = new Square(0);
			Scalene a1 = new Scalene(0, 0, 0);
            //System.out.println("Area of square: " + s1.calculateArea()); // Assuming a method calculateArea exists
			System.out.println(a1.calculateArea());
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Quadrilateral quadrilateral = new Quadrilateral(3, 4, 5, 100) {
                @Override
                public double calculateArea() {
                    return 0;
                }
            };
            quadrilateral.validateQuadrilateralInequality();
            System.out.println("Quadrilateral satisfies the inequality theorem.");
        } catch (InvalidQuadrilateralException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
