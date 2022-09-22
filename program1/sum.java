//Auther: Praveen kumar
//Title: sum and average
//quiz: enter 2 values and find sum and average


import java.util.*;
class sum
{
 public static void main(String[]args)
 {
  Scanner sc=new Scanner(System.in);
  int i=0;
  int j=0;
  System.out.println("Enter the value");
  i=sc.nextInt();
  System.out.println("Enter the value");
  j=sc.nextInt();
  int sum=0;
  int avr=0;
  while(i<j)
  {
   System.out.println("print the sum:"+sum);
   System.out.println("print the avr:"+avr);
   sum=i+j;
   avr=sum/2;
   i++;
  }
  }
}