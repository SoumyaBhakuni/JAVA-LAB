class Cylinder implements Volume {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    public void displayVolume() {
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of Cylinder: %.2f\n", volume);
    }
}
