package lab1_18c;

public abstract class Triangle implements IPolygon
{
    double a;
    double b;
    double c;
        
    @Override
    public abstract double area();
    
    @Override
    public abstract double perimeter();
}

