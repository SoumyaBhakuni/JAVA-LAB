public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cone
        System.out.print("Enter radius and height of cone: ");
        double r1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        Volume cone = new Cone(r1, h1);
        cone.displayVolume();

        // Hemisphere
        System.out.print("Enter radius of hemisphere: ");
        double r2 = sc.nextDouble();
        Volume hemisphere = new Hemisphere(r2);
        hemisphere.displayVolume();

        // Cylinder
        System.out.print("Enter radius and height of cylinder: ");
        double r3 = sc.nextDouble();
        double h3 = sc.nextDouble();
        Volume cylinder = new Cylinder(r3, h3);
        cylinder.displayVolume();

        sc.close();
    }
}

