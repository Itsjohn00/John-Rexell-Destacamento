
import java.util.Scanner;


public class scenario1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter your First number ");
        int a = sc.nextInt();
        System.out.println(" Enter your Second number ");
        int b = sc.nextInt();
        
        int c;
        c = a+b;
        
        System.out.println("Your First number is " + a);
        System.out.println("Your Second number" + b);
        System.out.println("Total amount is  " +c);
    }
      
}
