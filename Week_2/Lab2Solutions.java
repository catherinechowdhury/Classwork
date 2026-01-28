package Week_2;
import java.util.*;
import java.io.*;

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

    public static boolean validUserName(String username){
        for(int i = 0; i < username.length(); i++){
            if(!Character.isLowerCase(username.charAt(i))){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) throws FileNotFoundException{
        // //Create an Integer Arraylist
        // ArrayList<Integer> al = new ArrayList<>();
        
        // createAndFill(al, 10);
        // System.out.println(al);

        // double average = computeAverage(al);
        // System.out.println("Average: " + average);

        // removeValues(al, average);
        // System.out.println(al);

        // //How many usernames are valid?
        // Scanner input = new Scanner(new File("users.csv"));

        // int count = 0;

        // while(input.hasNext()){
        //     String line = input.nextLine();
        //     String[] data = line.split(",");

        //     boolean valid = validUserName(data[0]);

        //     if(valid){
        //         System.out.println(data[0]);
        //         count++;
        //     }
        // }

        // System.out.println("Number of valid usernames: " + count);

        // input.close();

        LinkedList<Integer> list = new LinkedList<>();

        addIntegers(list);
        printLinkedList(list);
        printLength(list);
        printIndex(list, 2);

    }

    public static void addIntegers(LinkedList<Integer> list){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        list.add(x);
        list.add(y);
        list.add(z);

    }

    public static void printIndex(LinkedList<Integer> list,int n){
        System.out.println(list.get(n));
    }

    public static void printLength(LinkedList<Integer> list){
        System.out.println(list.size());
    }

    public static void printLinkedList(LinkedList<Integer>list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
    
}
