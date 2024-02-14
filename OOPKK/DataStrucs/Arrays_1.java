package  JavaOOP;
import java.util.Arrays;
public class Arrays_1 {
    public static void main(String[] args) {
      int[] arr = {3,5,7,8};
      for(int i = 0; i < 4; i++){
            System.out.println(arr[i]);
        }
//      DataType[] varName = new DataType[size];
      int[] arr2 = new int[5];
        for(int i = 0; i < 5; i++){
           arr2[i] = 2*i;
        }
        for(int i = 0; i < 5; i++){
            System.out.println(arr2[i]);
        }

        // Other way to print arrays
        System.out.println(Arrays.toString(arr2));
    }
}
/*
How it works :
   > There are no pointers and in the heap memory, the array created might be
     continuous or not, it totally depends on JVC to decide.
   > All the objects are stored in heap
   > Heap objects are not continous
   > Dynamic memory allocation at runtime
   > Primitives are stored in Stack memory : int, bool etc
   > Objects : arrays, string other class defined objs are stored in heap.
   > Arrays are collection of memory addressese. and all a[0] a[1] a [2] are
     the reference variables. And the actual objects are stored at random
     places in memory. Like the rerference vars point to all the objects at
     random places.
*/