// Abstract base class Temperature
abstract class Temperature13 {
    double temp;  // Temperature value

    // Method to set temperature data
    void setTempData(double temp) {
        this.temp = temp;
    }

    // Abstract method to be implemented by subclasses
    abstract void changeTemp();
}
