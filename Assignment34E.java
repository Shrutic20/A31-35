/*
  Write java program which accept N numbers from user and return
  product of all odd elements.
  Input  : 15 66 3 70 10 88  
  Output : 45  
 */

  import java.util.*;

  class Number
  {
    public int Product(int Arr[])
    {
        int i = 0, iMul = 1;
      for(i = 0; i < Arr.length; i++)
      {
        if(Arr[i] % 2 != 0)
        {
          iMul = iMul * Arr[i];
        }
      }
      return iMul;
    }
  }

  class Assignment34E
  {
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      int iNo = 0, i = 0;
      int iRet = 0;

      System.out.println("Enter number of elements:");
      iNo = sobj.nextInt();

      int [] brr = new int[iNo];

      System.out.println("Enter values:");
      for(i = 0; i < iNo; i++)
      {
        brr[i] = sobj.nextInt();
      }

      Number obj = new Number();
      iRet = obj.Product(brr);

      
      System.out.println("Product of all odd elements is: "+iRet);

    }
  }