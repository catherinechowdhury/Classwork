import java.util.*;

public class Colors {
    private int red;
    private int blue;
    private int green;

    public Colors(){
        red = 0;
        blue = 0;
        green = 0;
    }
    
    public void setColors(int r, int b, int g){
        
        if(checkColor(r)){
            red = r;
        }
        if(checkColor(b)){
            blue = b;
        }

        if(checkColor(g)){
            green = g;
        }
    }

    public void setRandom(){
        red = (int)(Math.random() * (255-0));
        green = (int)(Math.random() * (255-0));
        blue = (int)(Math.random() * (255-0));

    }
    public boolean checkColor(int color){
        if(color >= 0 && color <= 255){
            return true;
        }
        return false;
    }

    public void setDefault(){
        red = 0;
        blue = 0;
        green = 0;
    }

    public boolean equals(Colors o){
        if(this.red == o.red && this.blue == o.blue && this.green == o.green){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Color objects: ");
        int num = input.nextInt();

        Colors[] array = new Colors[num];

        for(int i = 0; i < num; i++){
            array[i] = new Colors();
        }

        for(int i = 0; i < array.length; i++){
            array[i].setRandom();
        }

        for(int i = 0; i < array.length; i++){
            displayInfo(array[i]);
        }

    }

    public static void displayInfo(Colors obj){
        System.out.println("Red: "+ obj.red+ " Blue: "+ obj.blue +" Green: "+ obj.green);
    }
}
