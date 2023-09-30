import java.util.*;
class Solution {
    public static int SelectionSort(int[] input){
        for(int i = 0; i<input.length-1; i++){
            int mini = input[i];
            int minIndex = i;
        
        for(int j = i+1; j<input.length; j++){
            if(input[j] < mini){
                mini = input[j];
                minIndex = j;
            }
        }
        
        if(minIndex != -1){
            input[minIndex] = input[i];
            input[i] = mini;


        }
        }
    }

    public static void main(String[] args) {
        int[] input = {2,6,9,1,5};
        SelectionSort(input);
        for(int i = 0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }
}