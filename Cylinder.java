// Cylinder.java
class Cylinder extends Shape implements Volume {
    public Cylinder(double radius, double height) {
        super(radius, height, 0, 0);
    }
    public double calculateVolume() {
        return Math.PI * dim_one * dim_one * dim_two;
    }
    public double calculateSurfaceArea() {
        return 2 * Math.PI * dim_one * (dim_one + dim_two);
    }
}
