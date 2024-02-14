package JavaOOP;

public class Max{
    public static void main(String[] args) {
        int[] arr = {1,3,6,4,0,5};
        System.out.println(max(arr));
    }

    private static int max(int[] arr){
        int mx = arr[0];
        for(int i =0; i < arr.length; i++){
            if(mx < arr[i]){
                mx = arr[i];
            }
        }
        return  mx;
    }
}