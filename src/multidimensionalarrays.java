import java.util.Arrays;
import java.util.Scanner;

public class multidimensionalarrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        Scanner in = new Scanner(System.in);
        //the array inside the array can have anynumber of elements thats why it its imp to define the row size but not column size
        //taking input in a multi dim array:
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] =in.nextInt();
            }

        }

//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//               System.out.print(arr[i][j]+" ");
//            }
//           System.out.println();
//        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
