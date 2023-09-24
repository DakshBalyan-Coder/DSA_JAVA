import java.util.Scanner;
class Solution {
    public static int factorial(int n){
        int fact = 1;
        for(int i = 2; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }
}        