import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {
        int[] arr ={1,3,23,9,18,26};
//        swap(arr,1,3);
        reverseAnArray(arr);
    }
    static void reverseAnArray(int[] arr){
        int start=0,end=arr.length-1;
        while(start< end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println("Reversing above array:");
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr ,int i1,int i2){
        int temp= arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
}
