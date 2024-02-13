package JavaOOP;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(34);
        list.add(11);
        System.out.println(list);
        System.out.println(list.contains(20));
        list.set(2,66);  // this overrides 11 on index 2 with 66
        System.out.println(list);
        list.remove(1);  // this removes at the index
        System.out.println(list);

        // Inserting in an ArrayList
        System.out.println("Insert the stuff");
        for(int i =0; i < 5; i++){
            list.add(sc.nextInt()); // This will follow after the above insertions
        }

        // Printing in a diff way :
        for(int i =0; i < 5; i++){
            System.out.println(list.get(i));
        }
    }
}


// ArrayList are dynamic in size.