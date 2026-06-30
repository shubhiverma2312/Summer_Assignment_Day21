import java.util.*;
class q83
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=sc.nextLine();
        int i,len,vow=0,cons=0,spch=0;
        len=str.length();
        String vowels="AEIOUaeiou";
        for(i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
                spch++;
            else if(vowels.indexOf(ch)==-1)
                cons++;
            else
                vow++;
        }
        System.out.println("VOWELS = "+vow);
        System.out.println("CONSONANTS = "+cons);
    }
}