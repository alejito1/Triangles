package interfaces;

import exceptions.ScaleException;

public interface Shape {
    public double calculateArea();
    public double calculatePerimeter();
    public void scale(double scaleFactor) throws ScaleException;

    
}
