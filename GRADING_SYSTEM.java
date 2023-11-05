
import java.util.Scanner;


public class GRADING_SYSTEM {
    
   public static void main(String[] args)  {
       
       Scanner input = new Scanner(System.in);
       
       int grades, level;
       char YN = 0;
       char proceed = 0;
       char record = 0;
       int a, b, c, d, e, f;
       
       System.out.println("Welcome to the Student Grading System.");
       System.out.print("Would you like to proceed");
       System.out.println("Y/N");
       proceed = input.next().charAt(0);
       
              
       switch (proceed)  {
           case 'Y':
                      System.out.println(" Input your First Name: ");
                      char name = input.next().charAt(0);
                      break;
           case 'y':
                      System.out.println(" Input your First Name: ");
                      break;
           case 'N':
                      System.out.println(" Goodbye: ");
                      System.exit(0);
                      break;
           case 'n':  
                      System.out.println(" Goodbye: ");
                      System.exit(0);
                      break;
                      
      }                
      System.out.println(" Input your grade level: ");
      level = input.nextInt();
      System.out.println(" Input your Section: ");
      char section = input.next ().charAt(0);
      System.out.println("Do you wish to record your grade?");
      System.out.println("Y/N");
      record = input.next(). charAt(0);
      
      switch (record) {
          
          case 'Y':
                    System.out.println("Input your grades in Computer Programming:");
                    a = input.nextInt();
                    if (a > 75.1)
                    System.out.println("Psssed");
                    else
                    System.out.println("Failed");
                    break;
          case 'y':
                    System.out.println("Input your grades in Computer Programming:");
                    a = input.nextInt();
                    break;
          case 'N': 
                    System.out.println("Goodbye");
                    System.exit(0);
                    break;
          case  'n':
                    System.out.println("goodbye");
                    System.exit(0);
                    break;  
      }
      System.out.println("Input your grades in Calculus");
                    b = input.nextInt();
                    if (b > 75.5)
                    System.out.println("Passed");
                    else
                    System.out.println("Failed");
      System.out.println("Input your grades in Purposive Communication");
                    c = input.nextInt();
                    if (c > 75.5)
                    System.out.println("Passed");
                    else
                    System.out.println("Failed");
      System.out.println("Input your grades in Computing Fundamentals");
                    d = input.nextInt();
                    if (d > 75.5)
                    System.out.println("Passed");
                    else
                    System.out.println("Failed"); 
      System.out.println("Input your grades in Euthencis");
                    e = input.nextInt();
                    if (e > 75.5)
                    System.out.println("Passed");
                    else
                    System.out.println("Failed");              
      System.out.println("Input your grades in Understanding the self");
                    f = input.nextInt();
                    if (f > 75.5)
                    System.out.println("Passed");
                    else
                    System.out.println("Failed");
                                       
       }
      
   }         



