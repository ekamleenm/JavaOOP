package   JavaOOP;
import java.util.Scanner;
public class Array2D{
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);


         int[][] arr = new int[3][];    // Number of columns to specify is not important

        // Initialize the second dimension arrays
        for (int row = 0; row < arr.length; row++) {
            arr[row] = new int[3]; // You can specify the number of columns here
        }

        // Putting in the values
        for(int row = 0; row < arr.length; row++){
           // for each Column
           for(int col = 0; col < arr[row].length; col++){
               arr[row][col] = input.nextInt();
           }
        }

        // Printing
        for(int row = 0; row < arr.length; row++){
            // for each Column
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
        }
    }
}

/*
    Strings are immutable in JAVA and Arrays are mutable. In function when we
    pass arguments to functions, we actually pass the copy of reference var
    pointing to the same object. So if we change something via that copied ref
    variable, then the original object will be changes b/c both the ref vars
    are pointing to same object.
*/


/*
    2D arrays : Arrays inside of Arrays, arr[[Ref Pointer],[Ref Pointer],[Ref Pointer]]
    these Ref Pointer are pointing to the array objects  [1,2,3] [4,5,6] [7,6,9]

*/