/*
  Write java program which accept N numbers from user and accept
  one another number as NO , return index of last occurrence of that NO.
  Input  : 10 20 30 20     20
  Output :3
 */

  import java.util.*;

  class Number
  {
    public int LastOcc(int Arr[], int iNo)
    {
      int i = 0;
      int index = -1;
      for(i = Arr.length - 1; i >= 0; i--)
      {
        if(Arr[i] == iNo)
        {
          index = i;
          break;
        }
      }
      return index;
    }
  }

  class Assignment34C
  {
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      int iNo1 = 0, iNo2 = 0, i = 0;
      int iRet = 0;

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
      iRet = obj.LastOcc(brr, iNo2);

      System.out.println("Element is present at index : "+iRet);
      

    }
  }