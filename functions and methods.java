import java.util.Scanner;//for taking input
import java.lang.Math;//for use math functions
public class functions {
    //calculate sum of two numbers 
    /*
    public static void calsum(int num1,int num2){
        int sum = num1 + num2;
        System.out.println("sum is " +sum);
    }public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        calsum(a,b);
    }


    //1.call by value(swap)
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a is: " +a);
        System.out.println("b is: " +b);
    }
    public static void main(String args[]){
        int a =5;
        int b=10;
        swap(a,b); //call swap function
    }
    //if print statement also in  main function
    //then function run as the main function run
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
    }
    public static void main(String args[]){
        int a =5;
        int b=10;
        swap(a,b); //call swap function
        System.out.println("a is: " +a);
        System.out.println("b is: " +b);
    }


    //3.product of a and b
    public static int multiply(int a, int b){
        int multiply=a*b;
        return multiply;
    }
    public static void main(String args[]){
        int a= 92;
        int b= 50;
        int prod =multiply(a,b);
        System.out.println("a * b = " + prod);
    }
    
   //4.find factorial of a number
   public static int factorial (int n){

    int f = 1;
    for(int i=1; i<=n; i++){
        f= f*i;
    } 

    return f;
   }
   //public static void main(String args[]){
    //System.out.println(factorial(3));
   //}
    
   //5.BINOMIAL COFFICIENT OF A NUMBER
   public static int bincofficient(int n , int r){
    int fact_n = factorial(n);//if want to run factorial function we 
    int fact_r = factorial(r);//have written factorial function above
    int fact_nmr = factorial(n-r);//of the binomial cofficent code3
    int bincofficient= fact_n/(fact_r*fact_nmr);
    return bincofficient;
   }
   public static void main(String args[]){
    System.out.println(bincofficient(5,2));
   }


   //6.
   //(i)  FUNCTION OVERLOADLING USING PARAMETERS
   public static int sum(int a, int b){
    return a+b;
   }
   public static int sum(int a, int b,int c){
    return a+b+c;
   }
   public static void main(String args[]){
    System.out.println(sum(5,3));
    System.out.println(sum(5,2,1));
}

   //(i)  FUNCTION OVERLOADLING USING DATA TYPE
   public static int sum(int a, int b){
    return a+b;
   }
   public static float sum(float a, float b){
    return a+b;
   }
   public static void main(String args[]){
    System.out.println(sum(5,3));
    System.out.println(sum(4.8f,2.2f));
   }


   //7.CHECK IF A NUMBER IS PRIME OR NOT
   //(i)
   public static boolean isPrime(int n){
    for(int i=2;i<=Math.sqrt(n); i++){
        if(n%i==0){//n hr bar i sa divide hokr zero de rha h to mltb
            return false;//prime number nhi h to return false
        }
    }return true;//agr divide hokr zero nhi de rha to prime number h
   }
   //public static void main(String args[]){
    //System.out.println(isPrime(5));
   //}

   //(ii) PRINT ALL PRIMES IN A RANGE,N=20
   public static void Primeinrange(int n){
    for(int i=2;i<=n-1; i++){
        if(isPrime(i)){//call is prime function
            System.out.print(i+ " ");//if prime then print
        }
    }
   }  
   public static void main(String args[]){
    Primeinrange(20);
   }

   //8.
   //(i)BINARY TO DECIMAL
   public static void bintodecimal(int n){
    int mynum=n;
    int pow=0;
    int decimalnumber=0;
    while(n>0){
        int Lastdigit=n%10;
        decimalnumber=decimalnumber+(Lastdigit*(int)Math.pow(2,pow));//int=typecst
        pow++;
        n=n/10;
        System.out.print("decimal number of"+ mynum+"="+decimalnumber);
    }
   }
   public static void main(String args[]){
    bintodecimal(101);
   }

   //(ii) DECIMAL TO BINARY
   public static void decimaltobinary(int n){
    int mynum=n;
    int pow=0;
    int binarynumber=0;
    while(n>0){
        int remainder=n%2;
        binarynumber=binarynumber+(remainder*(int)Math.pow(10,pow));//int=typecst
        pow++;
        n=n/2;
        System.out.print("binary number of"+ mynum+"="+binarynumber);
    }
   }
   public static void main(String args[]){
    decimaltobinary(11);
   }

    //9.  SCOPE
    //(i)Method scope
    public static void main(String args[]){
        System.out.println(s);
        int s=45;
    }//gives error kuki variable s ko bad m define kia

public static void main(String args[]){
    int s=45;
    System.out.println(s);//run since variable is define above
}

    //(ii)block scope
    public static void main(String args[]){
        int s=45;
    }
    System.out.println(s);//wrong code kuki block se bhar
    //s ki value print karne ka lia mang rhe h

    public static void main(String args[]){
        int p=10;
        {
            int s=45;
            System.out.println(p);
        }System.out.println(p);
    }//RUN= since p is in the range of inner
    //and in main function block range 
*/    

    /* 
    //questions
    (i)compute sum of three numbers.

    public static void Average(int num1,int num2,int num3){
        int Average = (num1+num2+num3)/3;
        System.out.println("Average of three no. is " + Average);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Average(a,b,c);
    }

    //(ii)write a method name isEven that accept an int argument.
    //return true if argument is even or false otherwise.also
    //write a program to test your method.
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num=sc.nextInt();
        if(isEven(num)){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;
        }
    }

    //(iii)check if a number is palindrome
    public static boolean isPalindrome(int number){
        int palinderome=number;
        int reverse=0;
        while(palinderome!=0){
            int remainder=palinderome%10;
            reverse=reverse*10+remainder;
            palinderome =palinderome/10;
        }
        if (number ==reverse){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println("Please enter a number :");
        Scanner sc= new Scanner(System.in);
        int palindrome=sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("Number : "+ palindrome + "is palindrome");
        }else{
            System.out.println("Number : "+ palindrome + "is not palindrome");
        }
    }*/

    //(V)compute sum of digits in an integer
    public static int sumdigits(int n){
           int sumofdigits=0;
           while(n>0){
               int lastdigit =n%10;// % = gives remainder
               sumofdigits += lastdigit;
               n /=10;// / = gives quiotient
            }
            return sumofdigits;
    }
        public static void main(String args[]){
             Scanner sc= new Scanner(System.in);
             System.out.print("Input is an integer:");
             int digits = sc.nextInt();
             System.out.println("The sum is " + sumdigits(digits) );
            
        }
        
}

