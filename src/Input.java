import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] =in.nextInt();
        }

        for(int num:arr){ // for every element of the array print the element.
            System.out.println(num);
        }

        System.out.println(Arrays.toString(arr));
    }
}
