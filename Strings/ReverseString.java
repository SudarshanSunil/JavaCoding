import java.util.*;

public class ReverseString{

    public static String Reverse(String str)
    {
        int len=str.length();
            char[] tempChar=new char[len];
            char[] revS=new char[len];
            str.getChars(0,len,tempChar,0);
            String rev="";
            for(int i=len-1;i>=0;i--)
            {
                revS[len-1-i]=tempChar[i];
            }
            rev=new String(revS);
            return rev;
    }
    public static void main(String args[])
    {
        String p=Reverse("sdhfgchs dfjnk");
        System.out.println(p);

    }
}