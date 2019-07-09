package lab1_18c;
//THIS HAS FOUR SIDES
public abstract class Quadrilateral implements IPolygon
{   
    double a;
    double b;
    
    @Override
    public double area()
    {
        return a * b;
    }
    
    @Override 
    public double perimeter()
    {
        return a + b;
    }           
}

