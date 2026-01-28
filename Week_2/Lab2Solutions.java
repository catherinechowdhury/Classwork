package Week_2;
import java.util.*;

public class Lab2Solutions {

    public static ArrayList<Integer> createAndFill(ArrayList<Integer> al,int n){

        for(int i = 0; i < n; i++){
            al.add((int) (Math.random()*75) + 25);
        }

        return al;
        
    }

    public static double computeAverage(ArrayList<Integer> n){

        int sum = 0;

        for(int i = 0; i < n.size(); i++){
            sum += n.get(i);
        }

        return (double) sum/n.size();
    }

    public static void removeValues(ArrayList<Integer> n, double average){
        for(int i = 0; i < n.size(); i++){
            if(n.get(i) > average){
                n.remove(i);
                i--;
            }
        }
    }
    public static void main(String[] args){
        //Create an Integer Arraylist
        ArrayList<Integer> al = new ArrayList<>();
        
        createAndFill(al, 10);
        System.out.println(al);

        double average = computeAverage(al);
        System.out.println("Average: " + average);

        removeValues(al, average);
        System.out.println(al);
    }
    
}
