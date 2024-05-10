package cuadrilaterals;

import exceptions.InvalidQuadrilateralException;
import exceptions.SideException;

public class Parallelogram extends Quadrilateral{

    protected double height ;
    protected double base ;

    public Parallelogram(double longSide,  double shortSide, double height) throws InvalidQuadrilateralException, SideException {
        super (longSide, shortSide,longSide, shortSide );
        this.height = height;
        this.base = longSide;
    }

    public double calculateArea(){
        return base*height;
    }

    public String toString(){
        return "Parallelogram [height= " + height + ", base= " + base + ", Area= " + calculateArea()
                + ", Perimeter= " + calculatePerimeter() + "]";
    }
}
