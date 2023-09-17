import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();
        int cel = (5*(f-32))/9;
        System.out.println(cel);
       
        
    }
}