/*
  Write a program which accept number from user and return
  difference between summation of even digits and summation of odd
  digits.
  Input  : 2395
  Output : -15
 */

  import java.util.*;

  class Digit
  {
    public int CountDiff(int iVal)
    {
      int iDigit = 0, iCnt = 0, iEsum = 0, iOsum = 0, iDiff = 0;
      while(iVal != 0)
      {
        iDigit = iVal % 10;
        if(iDigit % 2 == 0)
        {
          iEsum = iEsum + iDigit;
        }
        else
        {
          iOsum = iOsum + iDigit;
        }
        
        iVal = iVal / 10;
      }
      iDiff = iEsum - iOsum;
      return iDiff;
    }
  }

  class Assignment33E
  {
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      int iNo = 0, iRet = 0;

      System.out.println("Enter number:");
      iNo = sobj.nextInt();

      Digit obj = new Digit();
      iRet = obj.CountDiff(iNo);

      System.out.println("Difference is: "+iRet);


    }

  }