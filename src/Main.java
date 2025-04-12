import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // datatype[] name =new datatype[size]
//       int[] rollnos = new int[5];
//        System.out.println(rollnos);
        int[] ros; //declaration of array
        ros = new int[5]; // object is being created in the heap memory here.
        // this creation happens at run time this is called dynamic memory allocation.
        // dynamic memory allocation : memory allocation that happens at execution time or run time.
        // the name ros will be in stack that will point to the memory in the heap.
        // there are no pointers in java.
        // heap objects are not continuous and heap is run time area where all the objects are created.
        // array objects in java may not be continuous - depends on jvm.
        // new keyword is basically used to create an object.
        // for integer array initially all elements will be zero.
        String[] arr = new String[4];
        //System.out.println(arr[0]);
        // for string array initially all elements are stored as null
        // null is a literal value that is a by default value reference elements points to.
        // primitives are stored in stack, String is an object it is stored in heap.
        // System.out.println(Arrays.toString(arr));

        System.out.println(ros);
        //
    }
}