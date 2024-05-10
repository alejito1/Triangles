package cuadrilaterals;

import exceptions.InvalidQuadrilateralException;
import exceptions.SideException;

public class Rectangle extends Parallelogram{
    public Rectangle (double base, double height) throws InvalidQuadrilateralException, SideException{
        super (base, base , height);
    }
    public double CalculateArea(){
        return base*height;

    }

    public String toString(){
        return "Rectangle [Area= " + CalculateArea() + ", Perimeter= " + calculatePerimeter() + "]";
    }
}
