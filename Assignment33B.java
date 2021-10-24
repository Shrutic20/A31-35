/*
  Write a program which accept number from user and return the
  count of odd digits.
  Input  : 223 
  Output : 1
 */

  import java.util.*;

  class Digit
  {
    public int CountOdd(int iVal)
    {
      int iDigit = 0, iCnt = 0;
      while(iVal != 0)
      {
        iDigit = iVal % 10;
        if(iDigit % 2 != 0)
        {
            iCnt++;
        }
        iVal = iVal / 10;
      }
      return iCnt;
    }
  }

  class Assignment33B
  {
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      int iNo = 0, iRet = 0;

      System.out.println("Enter number:");
      iNo = sobj.nextInt();

      Digit obj = new Digit();
      iRet = obj.CountOdd(iNo);

      System.out.println("Count of odd digits are: "+iRet);


    }

  }