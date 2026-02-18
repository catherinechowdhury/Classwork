public class Color {

    int red;
    private int green;
    private int blue;

    // Default constructor
    public Color() {
        this.red = 0;
        this.green = 0;
        this.blue = 0;
    }

    // Parameterized constructor
    public Color(int red, int green, int blue) {
        setColors(red, green, blue);

        // If values were invalid, prevent object creation
        if (!validColor(red) || !validColor(green) || !validColor(blue)) {
            throw new IllegalArgumentException("Invalid RGB values. Must be between 0 and 255.");
        }
    }

    // Validation method
    public boolean validColor(int color) {
        return color >= 0 && color <= 255;
    }

    // Set all colors at once
    public void setColors(int r, int g, int b) {
        if (validColor(r)) {
            this.red = r;
        }

        if (validColor(g)) {
            this.green = g;
        }

        if (validColor(b)) {
            this.blue = b;
        }
    }

    // Return array of colors
    public int[] getAllColors() {
        return new int[] { red, green, blue };
    }

    @Override
    public boolean equals(Object obj) {
        // what does this
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Color other = (Color) obj;
        return red == other.red &&
                green == other.green &&
                blue == other.blue;
    }

    @Override
    public String toString() {
        return "Color: R=" + red + ", G=" + green + ", B=" + blue;
    }
}
