/*
  Write a program which accept number from user and return the
  count of digits in between 3 and 7
  Input  : 224 
  Output : 1
 */

  import java.util.*;

  class Digit
  {
    public int CountRange(int iVal)
    {
      int iDigit = 0, iCnt = 0;
      while(iVal != 0)
      {
        iDigit = iVal % 10;
        if(iDigit > 3 && iDigit < 7)
        {
            iCnt++;
        }
        iVal = iVal / 10;
      }
      return iCnt;
    }
  }

  class Assignment33C
  {
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      int iNo = 0, iRet = 0;

      System.out.println("Enter number:");
      iNo = sobj.nextInt();

      Digit obj = new Digit();
      iRet = obj.CountRange(iNo);

      System.out.println("Count of digit between 3 to 7: "+iRet);


    }

  }