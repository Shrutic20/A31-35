/*
  Accept sing from user and reverse the contents of that string
  by toggling the case.
  Input  :  aBcdE
  Output :  eCDbA
*/

import java.util.*;

class StringX
{
	public String str1;


	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter First String: ");
		str1 = sobj.nextLine();
		
	}

	public void Display()
	{
		System.out.println("Entered first String: "+str1);
	}
}


class StringDemo extends StringX
{
	public String StrRevTglX()
	{
			char Arr[] = str1.toCharArray();
			int iStrt = 0, iEnd = Arr.length - 1, i = 0;
			char temp;

			for(i = 0; i < Arr.length; i++)
			{
				if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
				{
					Arr[i] = (char)(Arr[i] + ('a' - 'A'));
				}
				//if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
				else
				{
					Arr[i] = (char)(Arr[i] - ('a' - 'A'));
				}
			}

			while(iStrt < iEnd)
			{
				temp = Arr[iStrt];
				Arr[iStrt] = Arr[iEnd];
				Arr[iEnd] = temp;

				iStrt++;
				iEnd--;
			}


			return new String(Arr);


	}
}
	


class Assignment35D
{
	public static void main(String arg[])
	{
		String s;

		StringDemo obj = new StringDemo();
		obj.Accept();
		
		s = obj.StrRevTglX();

		System.out.println("Output:"+s);



	}
 
}
