public class JavaBasicsRunner
{
    public static void main(String[] args)
    {
        //Call and test the add method from Sum
        Sum.add(-3, 6);
        Sum.add(5, 0);
        Sum.add(-4, -6);
        Sum.add(4, 10);
        
        //Call and test the area and perimeter methods from Rectangle
        Rectangle.area(4,5);
        Rectangle.perimeter(4,5);
        
        Rectangle.area(3,10);
        Rectangle.perimeter(3,10);
        
        Rectangle.area(4, 6);
        Rectangle.perimeter(4,6);
        
        //Call and print the avg method from Average
        Average.avg(4,5);
        Average.avg(8, 10);
        Average.avg(3, 9);
        Average.avg(15, 2);
        
        //Call and print the cubeIt method from Cube
        Cube.cubeIt(5);
        Cube.cubeIt(3);
        Cube.cubeIt(2);
        Cube.cubeIt(10);
        
        //Call and print the area method from the Circle class
        Circle.area(2);
        Circle.area(4);
        Circle.area(6);
        Circle.area(3);
        
        //Call and print the slope method from Line
        Line.slope(1,3,6,8);
        Line.slope(1,5,1,7);
        Line.slope(3,6,8,2);
        Line.slope(2,4,-3,0);
        
        //Call and print the celstoFah method
        Temperature.celsToFah(0.0);
        Temperature.celsToFah(22.0);
        Temperature.celsToFah(10.5);
        Temperature.celsToFah(32.3);
        Temperature.celsToFah(-10.0);
    }
}