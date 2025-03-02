// 3d shapes
//Pyramid.java
class Pyramid extends Shape {
    public Pyramid(double baseLength) {
        super(baseLength, 0, 0, 5);
    }

    public double calculateArea() {
        double baseArea = dim_one * dim_one;
        double triangleArea = (Math.sqrt(3) / 4) * (dim_one * dim_one);
        return baseArea + (4 * triangleArea); // Surface Area
    }

    public double calculateVolume() {
        double height = (Math.sqrt(2.0 / 3.0) * dim_one);
        return (1.0 / 3) * (dim_one * dim_one) * height;
    }

    public double calculatePerimeter() {
        return 4 * dim_one; // Perimeter of the square base
    }
}

