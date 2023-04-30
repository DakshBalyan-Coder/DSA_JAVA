import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        while(i <= n/2){
            if(n % i == 0){
                System.out.print(i + " ");
            }
             i += 1;
        }
        
        
    }

    @Override
    public String toString() {
        return "Solution []";
    }
}