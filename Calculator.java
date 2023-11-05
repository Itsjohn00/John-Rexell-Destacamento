
import java.util.Scanner;


public class Calculator {

public static void main(String [] args) {
    
   int result = 0;
   char calculator;
   int operator, a , b;
   
          System.out.println(" 1- + \n 2- - \n 3- * \n 4- / \n ");
          Scanner sc  = new Scanner(System.in);
          System.out.println("Choose Operator");
          operator = sc.nextInt();
          System.out.println("Input your First number");
          a = sc.nextInt();
          System.out.println("Choose Operator");
          System.out.println("Input your Second number");
          b = sc.nextInt();
        
       switch(operator) {
           
           case 1:
               result = a + b;
               break;
               
           case 2:
               result = a - b;
               break;
           
           case 3:
               result = a * b;
               break;
             
           case 4:
               result = a / b;
               break;
               
           default:
               System.out.println("Entered operator is not valid");
       }
                  
           System.out.println("Result : " + result);   
           
       }   
        
   }


