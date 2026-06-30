import java.util.*;
class q84
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        String up=str.toUpperCase();
        String low=str.toLowerCase();
        System.out.println("IN UPPER CASE : "+up);
        System.out.println("IN LOWER CASE : "+low);
    }
}