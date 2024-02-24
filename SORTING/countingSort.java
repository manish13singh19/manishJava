import java.util.*;
public class countingSort {
    public static void sortByCount(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //for count frequency
        int[] count = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] arguments){
        int[] arr = {1,4,1,3,2,4,3,7};
        sortByCount(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
