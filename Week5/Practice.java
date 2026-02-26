public class Practice{
    // Attributes
    private int side1;
    private int side2;
    private int side3;

    /** 
    * Default Constructor
    * Set the sides of a triangle
    */
   public Practice(){
        side1 = 10;
        side2 = 20;
        side3 = 30;

   }
   

    /**
     * Constructor
     * Let the user set the sides of a triangle
     * @param int 
    */
//    public Practice(int x, int y, int z){
//         side1 = x;
//         side2 = y;
//         side3 = z;
//    }
   
   public Practice(int side1, int side2, int side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
   }

    /**
     * Method for Pythagorean Theorem
     * a^2 + b^2 = c^2
     * @param int
     */

    public void pyTheorem(int a, int b){

        double c = Math.sqrt((Math.pow(a, 2) +  Math.pow(b,2)));
    }

    /**
     * Method to print out sides
     * @param args
     */

    // System.out.println(obj)
    // System.out.println(obj.toString())


    public String toString(){
        return "These sides" + side1 + side2 + side3;
    }
  

}