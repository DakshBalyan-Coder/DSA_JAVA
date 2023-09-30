import java.util.*;
class Solution {
    public static int InsertionSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {6,4,3,5,2};
        InsertionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}