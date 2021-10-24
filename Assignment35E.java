/*
  Accept string from user and check whether the string is
  palindrome or not without considering its case.
  Input  :  1abccBA1
  Output :  Palindrome
*/

import java.util.*;

class StringX
{
    public String str;          

    public void Accept()        
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String :");
        str = sobj.nextLine();
    }

    public void Display()
    {
        System.out.println("Entered String is :"+str);
    }
}


class StringDemo extends StringX    
{
    public boolean CheckPalindrome()
    {
        char Arr [] = str.toCharArray();
        int iStart = 0, iEnd = Arr.length - 1;
        char iTemp;

        while(iStart < iEnd)
        {
            iTemp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = iTemp;

            iStart++;
            iEnd--;
        }

        String newstr = new String(Arr);    

        boolean bRet = newstr.equalsIgnoreCase(str); 
        return bRet; 
       
    }
}


class Assignment35E
{
    public static void main(String arg[])
    {
       boolean bRet = false;
       StringDemo mobj = new StringDemo();
       mobj.Accept();
       bRet = mobj.CheckPalindrome();

       if(bRet == true)
       {
         System.out.println("String is Palindrome!");
       }
       else
       {
         System.out.println("String is not Palindrome!");
       }
       
    }
}