package lab1_18c;
// THIS HAS FIVE SIDES
public class Pentagon implements IPolygon
{
    double size;
    double numOfSides = 5;
    
    Pentagon(double size)
    {
          this.size = size;
    }
    @Override
    public double area()
    {
        double angle = Math.toRadians(180/numOfSides);
        return size*size*numOfSides/(4*Math.tan(angle));
    }
    
    @Override
    public double perimeter()
    {
        double perimeter = numOfSides * size;
        return perimeter;
    }
    @Override
    public String toString()
    {
        return "Pentagon [size = "+size+"]";
    }
}
