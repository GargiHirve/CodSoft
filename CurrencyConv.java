import java.lang.Enum.EnumDesc;
import java.util.*;
import java.util.Scanner;
class CurrencyConv
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the currency!");
        System.out.println("Press 1 to convert Rupee into Dollar:");
        System.out.println("Press 2 to convert Rupee into Euro:");
        System.out.println("Press 3 to convert Dollar into Rupee:");
        System.out.println("Press 4 to convert Dollar into Euro:");
        System.out.println("Press 5 to convert Euro into Rupee:");
        System.out.println("Press 6 to convert Euro into Dollar:");
        int chc=sc.nextInt();
        System.out.println("Enter the amount:");
        double amt=sc.nextDouble();
        switch(chc)
        {
            case 1:
            rupDol(amt);
            break;

            case 2:
            rupEu(amt);
            break;

            case 3:
            dolRup(amt);
            break;

            case 4:
            dolEu(amt);
            break;

            case 5:
            euRup(amt);
            break;

            case 6:
            eurDol(amt);
            break;
        }
    }  
    public static void rupDol(double a)
    {
        System.out.println(a+"Rs = "+(a*0.012)+"$");
    }
    public static void rupEu(double b)
    {
        System.out.println(b+"Rs = "+(b*0.011)+"EUR");
    }
    public static void dolRup(double c)
    {
        System.out.println(c+"$ = "+(c*82.9)+"Rs");
    }
    public static void dolEu(double d)
    {
        System.out.println(d+"$ = "+(d*0.93)+"EUR");
    }
    public static void euRup(double e)
    {
        System.out.println(e+"EUR = "+(e*86.63)+"Rs");
    }
    public static void eurDol(double f)
    {
        System.out.println(f+"EUR = "+(f*1.08)+"$");
    }
}
