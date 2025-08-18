package CT1_Practice.Fall23;

class Logarithm {
    public int base;      // The base of the logarithm (b)
    public int argument;  // The argument of the logarithm (x)

    // Default constructor: sets base and argument to 0
    public Logarithm() {
        this.base = 0;
        this.argument = 0;
    }

    // Constructor with specified base and argument
    public Logarithm(int base, int argument) {
        this.base = base;
        this.argument = argument;
    }

    // Copy constructor: creates a new object with the same values as another Logarithm object
    public Logarithm(Logarithm other) {
        this.base = other.base;
        this.argument = other.argument;
    }

    // Method to evaluate log_base(argument)
    // Returns the integer part only (fractional part removed)
    // Returns 0 if the base <= 1 or argument <= 0 (invalid logarithm)
    public int myfun() {
        if (base <= 1 || argument <= 0) {
            return 0; // Invalid logarithm, return 0
        }
        double value = Math.log(argument) / Math.log(base); // Calculate logarithm
        return (int) value; // Convert to integer by removing fractional part
    }
}
