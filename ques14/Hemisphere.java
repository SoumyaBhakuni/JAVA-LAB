class Hemisphere implements Volume {
    double radius;

    Hemisphere(double r) {
        radius = r;
    }

    public void displayVolume() {
        double volume = (2.0 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.printf("Volume of Hemisphere: %.2f\n", volume);
    }
}
