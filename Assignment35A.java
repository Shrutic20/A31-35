/*
  Write a java program which accepts 2 strings from user and
  concat N characters of second string after first string.Value of N
  should be accepted from user.
  Input  :  Marvellous Infosystems
  					Logic Building
  					5
  Output : Marvellous Infosystems Logic
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
	public String StrNCatX(int n)
	{
		int i = 0;
		String Result;
		char Arr []= new char[n];
		char Arr2[] = str2.toCharArray();

		if(n > str2.length())
		{
			Result = str1 +" "+str2;
		}
		else
		{
		   for(i = 0; i <  n; i++)
		   {
			    Arr[i] = Arr2[i];

		   }
				String newArr2 = new String(Arr);
				Result = str1 +" "+ newArr2;

		
	  } 
	  return Result;
  }
}
	


class Assignment35A
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);

		StringDemo obj = new StringDemo();
		obj.Accept();
		
		System.out.println("Enter number : ");
		int iNo = sobj.nextInt();

		String s = obj.StrNCatX(iNo);
		System.out.println("Output:"+s);


	}
 
}
