// Name:Anusri Kadam
// PRN: 23070126016
// Batch: SY AIML A1

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Sphere");
            System.out.println("5. Cylinder");
            System.out.println("6. Pyramid");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double radius = scan.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area: " + circle.calculateArea());
                    System.out.println("Perimeter: " + circle.calculatePerimeter());
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double length = scan.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double width = scan.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area: " + rectangle.calculateArea());
                    System.out.println("Perimeter: " + rectangle.calculatePerimeter());
                    break;
                case 3:
                    System.out.print("Enter side of square: ");
                    double side = scan.nextDouble();
                    Square square = new Square(side);
                    System.out.println("Area: " + square.calculateArea());
                    System.out.println("Perimeter: " + square.calculatePerimeter());
                    break;
                case 4:
                    System.out.print("Enter radius of sphere: ");
                    double sphereRadius = scan.nextDouble();
                    Sphere sphere = new Sphere(sphereRadius);
                    System.out.println("Volume: " + sphere.calculateVolume());
                    System.out.println("Surface Area: " + sphere.calculateSurfaceArea());
                    break;
                case 5:
                    System.out.print("Enter radius of cylinder: ");
                    double cylinderRadius = scan.nextDouble();
                    System.out.print("Enter height of cylinder: ");
                    double cylinderHeight = scan.nextDouble();
                    Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    System.out.println("Volume: " + cylinder.calculateVolume());
                    System.out.println("Surface Area: " + cylinder.calculateSurfaceArea());
                    break;
                case 6:
                    System.out.print("Enter length of pyramid base: ");
                    double pyramidLength = scan.nextDouble();
                    Pyramid pyramid = new Pyramid(pyramidLength);
                    System.out.println("Volume: " + pyramid.calculateVolume());
                    System.out.println("Surface Area: " + pyramid.calculateSurfaceArea());
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        } while (choice != 7);
        scan.close();
    }
}
