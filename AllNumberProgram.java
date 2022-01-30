import java.util.Scanner;
public class AllNumberProgram{

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();

        //SumOf Digit ex:123 ,Result=1+2+3=6
        sumOfDigits(n);

        //spy number: sum of its digits equal to product of its digits
        //ex: 123 =1+2+3 =1*2*3= 6
        spyNumber(n);

        //Number is palindrome of not
        numberPalindrome(n);

        //SpecailNumber=>SumofDigits plus product of digits is equals to the orginal number.
        //eg:- 59 = (5+9) + (5*9) =59
        specialNumber(n);

        //Niven/Harshad Number: number divisible by its sum of digits
        //eg:- 156 = 156/(1+5+6) =12
        nivenNumber(n);

        //DuckNumber: A number which has zeroes present in it .
        //eg: 402,280
        duckNumber(n);

        //Neon Number: when sum of its digits of square of number is equal to the number
        //eg:- 9 =9*9=81  8+1=9
        neonNumber(n);

    
    }

    //**********Sum of Digits*********** */
    static void sumOfDigits(int n)
     {
         int lastDigit,sum=0;
        int m=n;
        while(m !=0)
        {
            lastDigit = m % 10 ;
            //logic
            sum= sum + lastDigit;
            m = m / 10;
        }
        System.out.println("Sum of Digits of "+n+" = "+sum );
       
    }
    //******************* */
    /******Number Palindrome******** */
    static void numberPalindrome(int n)
     {
         int lastDigit,reverse=0;
        int m=n;
        while(m !=0)
        {
            lastDigit = m % 10 ;
            //logic
            reverse= reverse * 10 + lastDigit;
             m = m / 10;
        }
        if(n == reverse)
        {
            System.out.println("Yes,"+n+" is Palindrome Number" );
        }
        else
        {
            System.out.println("No,"+n+" is not Palindrome Number" );
        }

     }

    /***************** */
   
     static void spyNumber(int n)
     {
         int lastDigit,sum=0,prod=1;
        int m=n;
        while(m !=0)
        {
            lastDigit = m % 10 ;
            //logic
            sum= sum + lastDigit;
             prod=prod * lastDigit;;
            m = m / 10;
        }
        if(sum == prod)
        {
            System.out.println("Yes,"+n+" is spy Number" );
        }
        else
        {
            System.out.println("No,"+n+" is not spy Number" );
        }

     }
     //************Special Number */
     static void specialNumber(int n)
     {
         int lastDigit,sum=0,prod=1;
        int m=n;
        while(m !=0)
        {
            lastDigit = m % 10 ;
            //logic
            sum= sum + lastDigit;
             prod=prod * lastDigit;;
            m = m / 10;
        }
        if(sum+prod == n)
        {
            System.out.println("Yes,"+n+" is Special Number" );
        }
        else
        {
            System.out.println("No,"+n+" is not Special Number" );
        }

     }
     //**********Niven Number*********** */
    static void nivenNumber(int n)
    {
        int lastDigit,sum=0;
       int m=n;
       while(m !=0)
       {
           lastDigit = m % 10 ;
           //logic
           sum= sum + lastDigit;
           m = m / 10;
       }
       if(n%sum == 0)
       {
        System.out.println("Yes,"+n+" is Niven/Harshad Number");
       }
       else{
        System.out.println("No,"+n+" is  not Niven/Harshad Number" );
       }
       
      
   }
   //******************* */
   /***********Duck Number */
   static void duckNumber(int n)
   {
    int m=n,count=0;
    while(m !=0)
    {
        int lastDigit = m % 10 ;
        if(lastDigit == 0)
            count++;
        m = m / 10;
    }
    if(count > 0)
    {
        System.out.println("Yes,"+n+" is Duck Number");
    }
    else
    {
        System.out.println("No,"+n+" is not Duck Number");
    }
   }
   //*********************** */
   /************Neon Number */
   static void neonNumber(int n)
   {
       int lastDigit,sum=0;
      int m=n;
       m=m*m;
      while(m !=0)
      {
          lastDigit = m % 10 ;
          //logic
          sum= sum + lastDigit;
          m = m / 10;
      }
      if(sum == n)
      {
          System.out.println("Yes,"+n+" Neon Number" );
      }
      else
      {
          System.out.println("No,"+n+" is not Neon Number" );
      }

   }
   /********** */

      /*
    template
    int m=n;
    while(m !=0)
    {
        int lastDigit = m % 10 ;
        //login
        m = m / 10;
    }
    if(check)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
     */
}