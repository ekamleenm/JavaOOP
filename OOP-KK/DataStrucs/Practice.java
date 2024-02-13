package  JavaOOP;
import java.util.Arrays;

public class Practice{
    public static void main(String[] args) {
        int[] arr = {1,4,6,8,2};
        swap(arr, 1,3);
        for(int i =0; i < 5; i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}