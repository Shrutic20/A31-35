/*
  Write java program which accept N numbers from user and accept
  Range, Display all elements from that range
  Input  : 11 22 13 25 23 44     10 20
  Output : 11 13  
 */

  import java.util.*;

  class Number
  {
    public void Display(int Arr[], int Strt, int End)
    {
      int i = 0;
      for(i = 0; i < Arr.length; i++)
      {
        if((Arr[i] > Strt) && (Arr[i] < End))
        {
          System.out.println(Arr[i]);
        }
      }
    }
  }

  class Assignment34D
  {
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      int iNo1 = 0, iStart = 0, iEnd = 0, i = 0;

      System.out.println("Enter number of elements:");
      iNo1 = sobj.nextInt();

      int [] brr = new int[iNo1];

      for(i = 0; i < iNo1; i++)
      {
        brr[i] = sobj.nextInt();
      }

      System.out.println("Enter Start:");
      iStart = sobj.nextInt();
      System.out.println("Enter End:");
      iEnd = sobj.nextInt();

      System.out.println("Elements between given range: ");

      Number obj = new Number();
      obj.Display(brr, iStart, iEnd);

      
      

    }
  }