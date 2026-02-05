package Week_3;

public class Substring {
    public static void main(String[] args){
        // [C a t h e r i n e]
        //  0 1 2 3 4 5 6 7 8

        String name = "Catherine";
        
        //substring(starting index, ending index) Exclusive

        // c a t
        // 0 1 2
        String beg = name.substring(0, 3); //char at 3 not included
        System.out.println(beg);

        // h e r
        // 3 4 5
        String mid = name.substring(3, 6);
        System.out.println(mid);

        // i n e
        // 6 7 8
        // substring(start index)
        String end = name.substring(6); //it will read from index 6 until the end of the String

        // Concatenation
        String names = beg + mid + end; // puts it all together

        System.out.println(names);
        System.out.println(beg + mid + end);

     }
    
}
