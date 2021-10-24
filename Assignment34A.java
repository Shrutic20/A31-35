/*
  Write java program which accept N numbers from user and accept
  one another number as NO , check whether NO is present or not.
  Input  : 10 20 30 40     10
  Output : Present
 */

  import java.util.*;

  class Number
  {
    public boolean Check(int Arr[], int iNo)
    {
      int i = 0;
      boolean bFlag = false;
      for(i = 0; i < Arr.length; i++)
      {
        if(Arr[i] == iNo)
        {
          bFlag = true;
          break;
        }
      }
      return bFlag;
    }
  }

  class Assignment34A
  {
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      int iNo1 = 0, iNo2 = 0, i = 0;
      boolean bRet = false;

      System.out.println("Enter number of elements:");
      iNo1 = sobj.nextInt();

      int [] brr = new int[iNo1];

      for(i = 0; i < iNo1; i++)
      {
        brr[i] = sobj.nextInt();
      }

      System.out.println("Enter element:");
      iNo2 = sobj.nextInt();

      Number obj = new Number();
      bRet = obj.Check(brr, iNo2);

      if(bRet == true)
      {
        System.out.println("Element is present!");
      }
      else{
        System.out.println("Element is not present!");
      }

    }
  }