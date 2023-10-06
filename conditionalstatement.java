import java.util.*;//this is an java package
import java.lang.Math;
public class conditionalstatement {
    public static void main(String args[]) {
        /*int age =15; //(isma hr bar IF check hoga)
        if (age>=18){
            System.out.println("adult : drive, vote");
        }
        if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("not adult");
        }
        //Print largest of 2 numbers
        int A=1;
        int B=5;
        if(A>=B){
            System.out.println("A is the largest of 2");
        }
        else{
            System.out.println("B is the largest of 2");
            } 
            
        //Print if a number is odd or even(iska lia java.util import karna paraga)     
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("EVEN");
        } else{ //after competion curly brasis of IF, ELSE can start in same line
            System.out.println("ODD");
        }
        //ELSE-IF statement(isma agr if wali condition true h to ELSEIF
        // and ELSE wali condition check hi nhi hogi 
        int age =21;
        if (age>=18){
            System.out.println("Adult");
        } else if(age>=13 && age < 18){
            System.out.println("teenager");
        }else{
            System.out.println("child");
        }
        //Income Tax calculator
        Scanner sc = new Scanner(System.in);
        int income= sc.nextInt();//define income variable jisma income define karanga
        int tax;//define tax variable to calculate tax(assume salary integer m aa rhi h)
        if(income<500000){
            tax=0;
        }else if(income>=500000 && income<=1000000){
            tax = (int)(income*0.2);//0.2 ko double type m consider na kara islia isa type cate karka integer bna dia
        }else{
            tax =(int)(income*0.3);
        }
        System.out.println("your tax is:"+tax);
        //Print largest of 3 numbers
        int A=1,B=3,C=6;
        if((A>=B) && (A>=C)){
            System.out.println("largest is A");
        }else if(B>=C){
            System.out.println("largest is B");
        }else{
            System.out.println("largest is C");
        }
        //Ternary operator(? i.e condition true or not,: nhi to)
        int number=4;
        String type=((number%2)==0)?"even":"odd";//:means nhi to
        System.out.println(type);

        //ques: check if a student will pass or fail
        int marks =67;
        String reportcard =marks>=33?"pass":"fail";
        System.out.println( reportcard );
        //Switch statement
        char ch='a';
        switch(ch){
            case 'd':System.out.println("Samosa");
                     break;
            case 'c':System.out.println("burger");
                     break;
            case 'a':System.out.println("mango shake");
                     break;
            default :System.out.println("we wake up");
        }
        // ques: design a calculator

        Scanner sc =new Scanner(System.in);
        System.out.println("enter a:");
        long a =sc.nextLong();
        System.out.println("enter b:");
        long b =sc.nextLong();
        System.out.println("enter operator:");
        char operator = sc.next().charAt(0);//charAt(0) iska bara m aaga paranga
        switch(operator){
            case '+':System.out.println(a+b);
                       break;
            case '-':System.out.println(a-b);
                       break;
            case '*':System.out.println(a*b);
                       break;
            case '/':System.out.println(a/b);
                       break;
            case '%':System.out.println(a%b);
                       break;      
        }

        //ques 1: write a program to get a number from user and print whether it is
        // positive or negative

        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        if (number>0){
            System.out.println("Given number is positive");
        } else{
            System.out.println("Given number is negative");
        }
        
        //ques 2: Prints the following code so that it prints you have a fever if your
        // temperature is above 100 otherwise print you don't have a fever.
        double temp=103.5;
        if (temp>100){
            System.out.println("You have a fever");
        }else{
            System.out.println("You don't have a fever");
        }

        //ques 3: write a java program to take input week number(1-7) and print day of
        // day of week name using switch case.
        Scanner sc= new Scanner(System.in);
        System.out.println("enter week number(1-7)");
        int week = sc.nextInt();
        switch(week){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tueday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("invalid input");
            break;
        }*/

        //ques 4: Write a java program that takes a year from user and print whether that 
        //year is a leap year or 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = sc.nextInt();
        boolean x= (year%4)==0;
        boolean y= (year%100)!=0;
        boolean z= ((year %100 ==0) &&(year % 400 ==0));
        if(x&&(y||z)){
            System.out.println("given year is a leap year");
        }else{
            System.out.println("year is not a leap year");
        }
    }
}