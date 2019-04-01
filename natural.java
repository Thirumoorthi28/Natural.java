import java.util.Scanner;
public class Natural 
{
    public static void main(String args[])
    {
        int a, i = 1 ;
        int x = 0;
        System.out.println("Enter Number :");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        while(i <= a)
        {
            x = x +i;
            i++;
        }
        System.out.println("Sum of natural numbers is :"+x);
    } 
}
