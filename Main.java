//Main.java
import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Length of rectangle");
		double length = Double.parseDouble(scan.nextLine());
		
		System.out.println("Enter width of rectangle");
		double width = Double.parseDouble(scan.nextLine());
		
		Rectangle rectangle = new Rectangle(length, width);
		System.out.println("Area of rectangle: " +rectangle.calculateArea());
		System.out.println("Perimeter of rectangle: " +rectangle.calculatePerimeter());
		System.out.println("Number of sides of rectangle: " +rectangle.getNumSides());
		
		
		System.out.println("Enter radius of circle");
		double radius = Double.parseDouble(scan.nextLine());
		Circle circle = new Circle(radius);
		System.out.println("Area of circle: " +circle.calculateArea());
		System.out.println("Perimeter of circle: " +circle.calculatePerimeter());
		//pyramid 
		System.out.println("Enter Length of pyramid");
		double pyramidLength = Double.parseDouble(scan.nextLine());
		
		Pyramid pyramid = new Pyramid (pyramidLength,pyramidHeight);
		System.out.println("Volume of pyramid: " +pyramid.calculateVolume());
		System.out.println("Surface Area of pyramid: " +pyramid.calculateSurfaceArea());
		System.out.println("Number of sides of pyramid: " +pyramid.getNumSides());
		
	}
}