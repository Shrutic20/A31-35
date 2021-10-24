/*
  Write Java program which accept N numbers from user and display
  all such elements which are divisible by 5.
  Input  : 85 66 3 80 93 88
  Output : 85 80
 */

import java.util.*;

class ArrayX
{
  public int Arr[];

  public ArrayX(int iSize)
  {
    Arr = new int[iSize];
  }

  public void Accept()
  {
    int i = 0;
    System.out.println("Enter elements :");
    Scanner sobj = new Scanner(System.in);
    for(i = 0; i < Arr.length; i++)
    {
        Arr[i] = sobj.nextInt();
    }

  }

  public void Display()
  {
    int i = 0;
    System.out.println("Entered elements are :");
    for(i = 0; i < Arr.length; i++)
    {
       System.out.println(Arr[i]);
    }

  }
}

class ArrayDemo extends ArrayX
{
  public ArrayDemo(int iVal)
  {
    super(iVal);
  }

  public void Divisible()
  {
    int i = 0;
    for(i = 0; i < Arr.length; i++)
    {
        if(Arr[i] % 5 == 0)
        {
          System.out.println(Arr[i]);
        }
    }

  }
}

class Assignment32B
{
  public static void main(String arg[])
  {
    Scanner sobj = new Scanner(System.in);

    int iNo = 0;

    System.out.println("Enter number of elements:");
    iNo = sobj.nextInt();

    ArrayDemo aobj = new ArrayDemo(iNo);
    aobj.Accept();
    System.out.println("Elements which are divisible by 5 : ");
    aobj.Divisible();

  }
}