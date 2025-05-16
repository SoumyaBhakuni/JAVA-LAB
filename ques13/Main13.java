// Main class to test the program
public class Main13 {
    public static void main(String[] args) {
        // Fahrenheit to Celsius conversion
        Temperature13 f = new Fahrenheit13();
        f.setTempData(98.6);  // Fahrenheit input
        f.changeTemp();

        // Celsius to Fahrenheit conversion
        Temperature13 c = new Celsius13();
        c.setTempData(37);  // Celsius input
        c.changeTemp();
    }
}
