package lab1_18c;

//THIS HAS 6 SIDES
public class Hexagon implements IPolygon
{
    double size;
    double numOfSides = 6;
  
    Hexagon(double size)
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
        return numOfSides*size;
    }
    @Override
    public String toString()
    {
        return "Hexagon [size = "+size+"]";
    }
}

