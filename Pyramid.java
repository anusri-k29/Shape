// 3d shapes
//Pyramid.java

import java.lang.*;
class Pyramid extends Shape{
	
	public Pyramid(double pyramidLength) {
		super(pyramidLength,0,0,5);
	}
	public double calculateSurfaceArea() {
		double baseArea = dim_one * dim_one; // Square base area
        double triangleArea = (Math.sqrt(3) / 4) * (dim_one * dim_one); // Area of one equilateral triangle
        return baseArea + (4 * triangleArea);

	}
	
	public double calculateVolume(){
		double height = (Math.sqrt(2.0 / 3.0) * dim_one); 
		return (1.0 / 3) * (dim_one * dim_one) * height;
	}
}