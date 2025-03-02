// Sphere.java
class Sphere extends Shape implements Volume {
    public Sphere(double radius) {
        super(radius, 0, 0, 0);
    }
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(dim_one, 3);
    }
    public double calculateSurfaceArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }
}
