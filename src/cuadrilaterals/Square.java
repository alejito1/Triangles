package cuadrilaterals;

public class Square extends Rectangle{
    private double edge;
    public Square (double edge){
        super (edge, edge);
        this.edge =edge;
    }
    public double calculateArea(){
        return edge*edge;
    }
    @Override
    public String toString(){
        return "Square [edge= " + edge + ", Area= " + calculateArea() + "]";
    }
}
