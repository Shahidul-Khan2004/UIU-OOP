package CT1_Practice.Spring25;

class Shape {

    int length, width, height;

    // This is the "default constructor" (no input values given).
    // If no details are provided, the shape is created with default values:
    // length = 10, width = 10, height = 10.
    Shape () {
        length = 10;
        width = 10;
        height = 10;
    }

    // This constructor is used when we only provide width and height values.
    // For example: new Shape(5, 7)
    // The given width and height are stored, but length is not set here (remains 0 by default).
    Shape (int width, int height) {
        this.height = height; // "this" means "the current object's height"
        this.width = width;   // Set the object's width to the given width
    }

    // This constructor is used when we provide width, height, AND length.
    // For example: new Shape(4, 5, 6)
    // The given values are stored in the object’s attributes.
    Shape (int width, int height, int length) {
        this.height = height;  // Store given height
        this.width = width;    // Store given width
        this.length = length;  // Store given length
    }

    // This constructor is called a "copy constructor".
    // It makes a new Shape by copying another Shape's values.
    // For example: if shape1 has (length=5, width=6, height=7),
    // and we do Shape shape2 = new Shape(shape1),
    // then shape2 will also have (5, 6, 7).
    Shape (Shape shape) {
        this.height = shape.height;  // Copy the height from the given Shape
        this.width = shape.width;    // Copy the width from the given Shape
        this.length = shape.length;  // Copy the length from the given Shape
    }
}

