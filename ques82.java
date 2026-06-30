import java.util.*;
class q82
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        String revstr="";
        int i;
        int len=str.length();
        for(i=len-1;i!=-1;i--)
        {
            revstr=revstr+str.charAt(i);
        }
        System.out.println("REVERSE STRING : "+revstr);
    }
}