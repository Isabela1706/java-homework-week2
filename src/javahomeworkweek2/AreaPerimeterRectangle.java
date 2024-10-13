package javahomeworkweek2;

/**
 * Java program to print the area and perimeter of a rectangle.
 *
 * Test Data:
 * Width = 5.5 Height = 8.5
 *
 */

public class AreaPerimeterRectangle {
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;

        //Calculate the area (Area = width + height)
        double area = width * height;

        //Calculate the perimeter (Perimeter = 2 * (width + height))
        double perimeter = 2 * (width + height);

        System.out.println("width = " + width);
        System.out.println("height = " + height);
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);



    }
}
