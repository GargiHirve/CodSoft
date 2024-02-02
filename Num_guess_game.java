import java.util.Random;
import java.util.Scanner;
class Num_guess_game
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Random rdom=new Random();
        int rnum=rdom.nextInt(100)+1;
        int chances=3;
        while(chances>0)
        {
            System.out.println("Enter a number between 1 to 100:");
            int num=sc.nextInt();
            
            if(num==rnum)
            {
                System.out.println("Congrats!Your gussed nuber is correct.");
                break;
            }
            else if(num<rnum)
            {
                System.out.println("Oops!Your gussed number is too low.");
                chances--;
            }
            else if(num>rnum)
            {
                System.out.println("Oops!Your gussed number is too high.");
                chances--;
            }
        }
        if(chances<=0)
        {
            System.out.println("Sorry!! You have run out of chances.");
            System.out.println("The actual number was "+rnum);
        }
    }
}
