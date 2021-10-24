/*
  Write Java program which accept N numbers from user and return
  difference between summation of even elements and summation of
  odd elements.
  Input  : 85 66 3 80 93 88
  Output : 53 (234 - 181)
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
      Scanner sobj = new Scanner(System.in);
      System.out.println("Entere elements :");
      for(i = 0; i < Arr.length; i++)
      {
          Arr[i] = sobj.nextInt();
      }
    }

    public void Display()
    {
      int i = 0;
      System.out.println("Entered elements are:");
      for(i = 0; i < Arr.length; i++)
      {
          System.out.println(Arr[i]);
      }
      
    }
  }

  class ArrayDemo extends ArrayX
  {
  	public ArrayDemo(int iNo)
    {
      super(iNo);
    }
    public int CountDiff()
    {
       int i = 0, iEsum = 0, iOsum = 0, iDiff = 0;
       for(i = 0; i < Arr.length; i++)
       {
          if(Arr[i] % 2 == 0)
          {
            iEsum = iEsum + Arr[i];
          }
          else
          {
            iOsum = iOsum + Arr[i]; 
          }
       }
       iDiff = iEsum - iOsum;
       return iDiff;
    }
  }

  class Assignment32A
  {
  	public static void main(String arg[])
  	{
      Scanner sobj = new Scanner(System.in);
      int iValue = 0, iRet = 0;

      System.out.println("Enter number of elements:");
      iValue = sobj.nextInt();

      ArrayDemo aobj = new ArrayDemo(iValue);
      aobj.Accept();
      //aobj.Display();
      iRet = aobj.CountDiff();
      System.out.println("Difference is : "+iRet);

  		
  	}
  }