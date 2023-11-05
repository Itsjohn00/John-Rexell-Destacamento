
import java.util.Scanner;


public class scenario6 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter your First number ");
        int a = sc.nextInt();
        System.out.println(" Enter your Second number ");
        int b = sc.nextInt();
        
        int c;
        c = a-b;
        
        if(a==b) {
            System.out.println("The 1st number and 2nd number are the same");
        }
        else{
            System.out.println("The 1st number and 2nd number are not the same");
        }
    }
}
