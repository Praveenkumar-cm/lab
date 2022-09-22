//Author: Praveen kumar
//Title: Arithmetic operator
//quiz: enter 2 values and get results
import java.util.*;
class test3
{
  public static void main(String[]args)
  {
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter your first value");
   int value1=Sc.nextInt();
   System.out.println("Enter your second value");
   int value2=Sc.nextInt();
   System.out.println("addition:"+(value1+value2));
   System.out.println("subtraction:"+(value1-value2));
   System.out.println("multiplication:"+(value1*value2));
   System.out.println("division:"+(value1/value2));
   System.out.println("modulas:"+(value1%value2));
  }
}  