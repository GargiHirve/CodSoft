import java.util.*;
public class StudentGradeCalc
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String n,h;
        int a,b,c,d,e,total;
        double per;
        System.out.println("Enter your name:");
        n=sc.nextLine();
        System.out.println("Enter division:");
        h=sc.nextLine();
        System.out.println("\n~~~~~Enter the marks of the following subjects out of 100~~~~~\n");
        System.out.println("\nEnter the marks of Science out of 100:");
        a=sc.nextInt();
        System.out.println("Enter the marks of Maths out of 100:");
        b=sc.nextInt();
        System.out.println("Enter the marks of English:");
        c=sc.nextInt();
        System.out.println("Enter the marks of Marathi:");
        d=sc.nextInt();
        System.out.println("Enter the marks of Hindi:");
        e=sc.nextInt();
        total=a+b+c+d+e;
        per=total/5;
        System.out.println(n);
        System.out.println("Division of student:"+h);
        System.out.println("Total marks:"+total);
        System.out.println("Average percentage:"+per);
        if(per>=90.0 && per<=100.0)
        {
            System.out.println("Grade:A+");
        }
        else if(per>=80.0 && per<=89.9)
        {
            System.out.println("Garde:A");
        }
        else if(per>=65.0 && per<=79.9)
        {
            System.out.println("Grade:B+");
        }
        else if(per>=50.0 && per<=64.9)
        {
            System.out.println("Grade:B");
        }
        else if(per>=35.0 && per<=49.9)
        {
            System.out.println("Grade:C");
        }
        else if(per<=34.9)
        {
            System.out.println("Grade:FAIL");
        }
        else 
        {
            System.out.println("Oops!Somwthing went wrong.");
        }
    }
}