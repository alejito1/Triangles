package cuadrilaterals;


import interfaces.Shape;
import exceptions.*;

public abstract class Quadrilateral implements Shape, Comparable<Quadrilateral>{
    protected double edge1, edge2, edge3, edge4;

    public Quadrilateral(double edge1, double edge2, double edge3, double edge4){
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
        this.edge4 = edge4;

    }
    public double calculatePerimeter(){
        return edge1+edge2+edge3+edge4;
    }

    public abstract double calculateArea();
    public void scale(double scaleFactor){
        this.edge1 = edge1*scaleFactor;
        this.edge2 = edge2*scaleFactor;
        this.edge3 = edge3*scaleFactor;
        this.edge4 = edge4*scaleFactor;
    }

    /**
     * Implement the method compareTo for check the integer it has to return, in this case, I chose the Area Criteria.
     * @param other
     * @return ffwq
     */
    public int compareTo(Quadrilateral other) {
        double thisArea = this.calculateArea();
        double otherArea = other.calculateArea();

        // Compare areas
        if (thisArea < otherArea) {
            return -1; // Current object is smaller
        } else if (thisArea > otherArea) {
            return 1; // Current object is greater
        } else {
            return 0; // Areas are equal
        }
    }

    /**
     * Check the sum of the shortest sides and compare with the long side
     * @throws InvalidQuadrilateralException
     */
    public void validateQuadrilateralInequality() throws InvalidQuadrilateralException {
        // Calculate the sum of the lengths of the shortest three sides
        double shortestSidesSum = edge1 + edge2 + edge3 + edge4;

        // Method for find the longest side
        double longestSide = edge1;
        if (edge2 > longestSide) {
            longestSide = edge2;
        }
        if (edge3 > longestSide) {
            longestSide = edge3;
        }
        if (edge4 > longestSide) {
            longestSide = edge4;
        }

        // Subtract the length of the longest side
        shortestSidesSum -= longestSide;

        // Check the inequality theorem
        if (shortestSidesSum <= longestSide) {
            throw new InvalidQuadrilateralException("Quadrilateral inequality theorem violated for (" + edge1 + "," + edge2 + "," + edge3 + "," + edge4 + ")");
        }
    }
}
