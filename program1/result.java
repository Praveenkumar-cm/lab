//Author:Praveen kumar
//Title :result
//quiz  :entering the name,reg no,marks and get result



import java.util.*;
class result
{
  public static void main(String[]args)
  {
   Scanner Sc=new Scanner(System.in);
   System.out.println("Enter the student name:");
   String name=Sc.next();
   System.out.println("Enter the student reg no:");
   int no=Sc.nextInt();
   System.out.println("Enter the mark:");
   int mark=Sc.nextInt();
   if(mark>=40)
    {
      System.out.println("Pass");
    }
    else
    {
      System.out.println("fail");
    }
   }
}
Footer
© 2022 GitHub, Inc.