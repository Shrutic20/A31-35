/*
  Write a program which accept number from user and return
  multiplication of all digits.
  Input  : 2395
  Output : 270
 */

  import java.util.*;

  class Digit
  {
    public int Multiply(int iVal)
    {
      int iDigit = 0, iCnt = 0, iMul = 1;
      while(iVal != 0)
      {
        iDigit = iVal % 10;
        iMul = iMul * iDigit;
        iVal = iVal / 10;
      }
      return iMul;
    }
  }

  class Assignment33D
  {
    public static void main(String arg[])
    {
      Scanner sobj = new Scanner(System.in);

      int iNo = 0, iRet = 0;

      System.out.println("Enter number:");
      iNo = sobj.nextInt();

      Digit obj = new Digit();
      iRet = obj.Multiply(iNo);

      System.out.println("Multiplication of all digits: "+iRet);


    }

  }