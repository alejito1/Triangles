package cuadrilaterals;

public class Rectangle extends Parallelogram{
    public Rectangle (double base, double height){
        super (base, base , height);
    }
    public double CalculateArea(){
        return base*height;

    }

    public String toString(){
        return "Rectangle [Area= " + CalculateArea() + ", Perimeter= " + calculatePerimeter() + "]";
    }
}
