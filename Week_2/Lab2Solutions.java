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
        // [1,2,3,4,5] size = 5
        //  0 1 2 3 4
        int sum = 15;
        
        //ArrayList -> method called size
        for(int i = 0; i < n.size(); i++){ // i = 5
            sum = sum + n.get(i); //n.get(4) = 5 + 10 = 15
        }

        double average = (double) sum/n.size(); // 5/2 = 2.5

        return average;
    }

    public static void removeValues(ArrayList<Integer> n, double average){
        for(int i = 0 ; i < n.size(); i++){
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
        //Create an Integer Arraylist
        ArrayList<Integer> al = new ArrayList<>();

        createAndFill(al, 10);
        System.out.println(al);

        double average = computeAverage(al);
        System.out.println("Average: " + average);

        removeValues(al, average);
        System.out.println(al);

        //How many usernames are valid?
        File file = new File("users.csv");
        Scanner input = new Scanner(file);

        int count = 0;

        // While loop

        while(input.hasNextLine()){
            // "Catherine,lune@gmail.com"
            String line = input.nextLine();
            // "Catherine" , "Email"
            // ["Catherine", "Email"]
            //     0           1
            String[] data = line.split(",");

            boolean valid = validUserName(data[0]);

            if(valid){
                System.out.println(data[0]);
                count++;
            }
        }

        System.out.println("Number of valid usernames: " + count);

        input.close();

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

        input.close();

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
