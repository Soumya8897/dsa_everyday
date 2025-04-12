public class Max_element {
    public static void main(String[] args) {
        int[] arr ={1,3,23,9,18};
        System.out.println("max element is");
        System.out.println(max(arr));
        System.out.println("max element in range is");
        System.out.println(maxInRange(arr,3,4));
    }
    private static int max(int[] arr){
        int max= arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    private static int maxInRange(int[] arr, int start,int end){
        int max= arr[start];
        for(int i=start;i<= end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
