// Subclass to convert Celsius to Fahrenheit
class Celsius13 extends Temperature13 {
    double ftemp;  // Converted Fahrenheit temperature

    // Override abstract method
    @Override
    void changeTemp() {
        ftemp = (9.0 / 5.0) * temp + 32;
        System.out.println("Converted Temperature in Fahrenheit: " + ftemp + "°F");
    }
}

