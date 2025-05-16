// Subclass to convert Fahrenheit to Celsius
class Fahrenheit13 extends Temperature13 {
    double ctemp;  // Converted Celsius temperature

    // Override abstract method
    @Override
    void changeTemp() {
        ctemp = (5.0 / 9.0) * (temp - 32);
        System.out.println("Converted Temperature in Celsius: " + ctemp + "°C");
    }
}
