public class TransparentColor extends Color {

    private double alpha;

    // Default constructor
    public TransparentColor() {
        super();
        this.alpha = 0.0;
    }

    // Parameterized constructor
    public TransparentColor(int red, int green, int blue, double alpha) {
        super(red, green, blue);

        if (!validAlpha(alpha)) {
            throw new IllegalArgumentException("Invalid alpha value. Must be between 0.0 and 1.0.");
        }

        this.alpha = alpha;
    }

    // Validate alpha
    private boolean validAlpha(double alpha) {
        return alpha >= 0.0 && alpha <= 1.0;
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(double alpha) {
        if (validAlpha(alpha)) {
            this.alpha = alpha;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;

        TransparentColor other = (TransparentColor) obj;
        return Double.compare(alpha, other.alpha) == 0;
    }

    @Override
    public String toString() {
        return "super.toString()" + ", A=" + alpha;
    }
}
