package lab1_18c;

//THIS HAS 8 SIDES
public class Octagon implements IPolygon
{
    double size;
    double numOfSides = 8;

    Octagon(double size)
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
        return "Octagon [size = "+size+"]";
    }
}

