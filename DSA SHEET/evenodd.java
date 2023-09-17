import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}