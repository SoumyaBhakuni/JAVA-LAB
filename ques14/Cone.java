lass Cone implements Volume {
    double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    public void displayVolume() {
        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.printf("Volume of Cone: %.2f\n", volume);
    }
}
