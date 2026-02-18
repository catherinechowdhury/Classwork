public class MathClass {
    
    /**
     * Find the square root of a number using the Math class
     * @param num the number to find the square root of
     */

    public void findSquareRoot(double num){

        double result = Math.sqrt(num);

        System.out.println("The square root of " + num + " is: " + result);
    }

    /**
     * Find the power of a number using the Math class
     * @param base the base number
     * @param exponent the exponent to raise the base to
     */
    public void findPower(double base, double exponent){

        double result = Math.pow(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    /**
     * Use Math.random() to generate a random number between 20 and 100 exclusive
     * max is 100 and min is 20
     * 
     */
    public void generateRandomNumber(){

        // Formula: (int)(Math.random() * (max - min) + min);

        int randomNum = (int) (Math.random() * (100 - 20) + 20);

        System.out.println("Random number between 20 and 100 exclusive: " + randomNum);
    }

    /**
     * Use Math.random() to generate a random number between 0 and 100 inclusive
     * max is 100 and min is 0
     */
    public void generateRandomNumberInclusive(){

        // Formula: (int)(Math.random() * (max - min + 1) + min);

        int randomNum = (int) (Math.random() * (100 - 0 + 1) + 0);

        System.out.println("Random number between 0 and 100 inclusive: " + randomNum);
    }

}