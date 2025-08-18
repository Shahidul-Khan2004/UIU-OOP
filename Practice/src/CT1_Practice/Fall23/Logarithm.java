package CT1_Practice.Fall23;

class Logarithm {
    public int base;      // base (b)
    public int argument;  // argument (x)
    // No-arg constructor: default values 0 and 0
    public Logarithm() {
        this.base = 0;
        this.argument = 0;
    }
    // Constructor with base and argument
    public Logarithm(int base, int argument) {
        this.base = base;
        this.argument = argument;
    }
    // Copy constructor
    public Logarithm(Logarithm other) {
        this.base = other.base;
        this.argument = other.argument;
    }
    // Evaluate log_base(argument). Return int by remove fractional part (type Cast).
    public int myfun() {
        if (base <= 1 || argument <= 0) {
            return 0;
        }
        double value = Math.log(argument) / Math.log(base);
        return (int) value;
    }
}
