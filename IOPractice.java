//Name:Kush Patel
//Date:11/04/22
//Assignment: Lab10
import java.util.Scanner;
import java.io.*;
public class IOPractice
{
   public static void main(String[] args) throws IOException
   {
      Scanner sc = new Scanner(new File("/mnt/a/secta/INPUT/mathIn.txt"));
      PrintWriter out = new PrintWriter("mathOut.txt");
      
      while(sc.hasNextLine())
      {
         String operation = sc.next();
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         
         if(operation.charAt(0)=='m')
         {
            out.println(num1 + " and " + num2 + " multiplied is " + (num1*num2));
         }
         if(operation.charAt(0)=='d')
         {
            out.println(num1 + " and " + num2 + " quotient is " + (num1/num2));
         }
         if(operation.charAt(0)=='s')
         {
            out.println(num1 + " and " + num2 + " subtracted is " + (num1-num2));
         }
         else
         {
            out.println(num1 + " and " + num2 + " added is " + (num1+num2));
         }
         



      }//end of loop
      
      out.close();//closes txt file after it is done writing in it
      
   }
}