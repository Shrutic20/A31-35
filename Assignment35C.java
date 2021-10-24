/*
  Write a program which 2 strings from user and check whether
  first N contents of two strings are equal or not.
  Input  :  Marvellous Infosystems
            Marvellous os
            10
  Output :  true
*/

import java.util.*;

class StringX
{
	public String str1;
	public String str2;


	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter First String: ");
		str1 = sobj.nextLine();

		System.out.println("Enter second String: ");
		str2 = sobj.nextLine();

	}

	public void Display()
	{
		System.out.println("Entered first String: "+str1);
		System.out.println("Entered second String: "+str2);
	}
}


class StringDemo extends StringX
{
	public boolean StrnCmpX(int n)
	{
		 char Arr[] = str1.toCharArray();
		 char Brr[] = str2.toCharArray();
		 int i = 0;
		 boolean bFlag = true;
		 for(i = 0; i < n; i++)
		 {
		 		if(Arr[i] != Brr[i])
		 		{
		 			bFlag = false;
		 			break;
		 		}
		 }
     return bFlag;
	}
}
	


class Assignment35C
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		StringDemo obj = new StringDemo();
		obj.Accept();
		
		System.out.println("Enter number:");
		int iNo = sobj.nextInt();

		boolean bRet = obj.StrnCmpX(iNo);

		if(bRet == true)
		{
			System.out.println("Contents are same!");
		}
		else
		{
			System.out.println("Contents are not same!");
		}


	}
 
}
