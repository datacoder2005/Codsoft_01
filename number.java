import java.util.*;
import java.util.Random;
class number
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\t\tWelcome to Number Game\n\n");
        int u=0,b=0,m=0;
        while(true)
        {
            b++;
            int i=1,n=0;
            System.out.println("\nGuess a number between 1 to 100\n");
            System.out.println("You have 5 trials \n");
            Random rand = new Random();
             n=rand.nextInt(100);
            while(i<=5)
            {
                System.out.println("Enter no.");
                int n1=sc.nextInt();
                if(n==n1)
                {
                    System.out.println("\nWow !! You Guessed it right\n");
                    u++;
                    m=1;
                    break;
                }
                else if(n>n1)
                {
                    System.out.println("Greater than "+n1);
                }
                else
                {
                    System.out.println("Less than "+n1);
                }
                i++;
            }
            if(m==0)
            {
                System.out.println("\nNo. of trials reached \n The number was "+n);
            }
            else
            {
                m=0;
            }
            System.out.println("\nDo you want to play again ? \n1.Yes\n2.No\n");
            int y=sc.nextInt();
            if(y==2)
            {
                 System.out.println("\nYour result \n No. of Rounds played : "+b+"\nNo. of Rounds Won : "+u);
                 System.exit(0);
            }
        }
    }
}