import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int p = 1;
        for(int i = 1; i<=x; i++){
            p = p*n;
        }
        System.out.println(p);

    }
}