import java.util.*;
class q81
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i=0;
        while(true)
        {
            try
            {
                char c=str.charAt(i);
                i++;
            }
            catch (Exception c)
            {
                System.out.println("Length of the string = "+i);
                break;
            }
        }
    }
}