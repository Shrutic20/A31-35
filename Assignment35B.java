/*
  Write a program which 2 strings from user and check whether
  contents of two strings are equal or not.
  Input  :  Marvellous Infosystems
            Marvellous Infosystems
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
	public boolean StrCmpX()
	{
			boolean bFlag = false;
			bFlag = str1.equals(str2);
			return bFlag;



	}
}
	


class Assignment35B
{
	public static void main(String arg[])
	{

		StringDemo obj = new StringDemo();
		obj.Accept();
		obj.Display();
		boolean bRet = obj.StrCmpX();

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
