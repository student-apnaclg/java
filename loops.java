import java.util.Scanner;

public class loops{
    public static void main(String args[]){
        /*//while loop
        int counter =0;
        while(counter<5){// agr while(true) kr du to ya infinite loop bn jayga
            System.out.println("Hello World");
            counter++;
        }
        System.out.println("printed Helllo World 5x");//x means times
        
        //ques: print number from 1 to 10
        int counter = 1;
        while(counter<=10){
            System.out.println(counter);//same line m chiye to print use karnga
            counter++;//iska bad println() use karnga same line m No. ka mid m space dena ka lia
        }

        // ques: print number from 1 to n
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter =1;
        while(counter<=range){
            System.out.print(counter + " ");
            counter++;// agr counter nhi lagyanga to infinite loop bn jayaga
        }System.out.println();
        
        //ques:Print sum of first n natural numbers
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        int i = 1;// i reprersent counter
        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("sum is: " + sum);
       
        //FOR LOOP
        for(int i =1; i<=10; i++) {
            System.out.println("Hello World");
        }
        //ques : Print square pattern
        for(int line=1; line<=4; line++){
            System.out.println("****");
        }
        //ques: Print reverse of a number
        int n =10899;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit + "");
            n = n / 10; //or n/=10
        }
        System.out.println();
        // is line ko use karo mt karo koi frak na parta

        //ques: Reverse the given number
        int n = 10899;
        int rev =0;
        while(n>0){
            int lastDigit =n%10;
            rev = (rev*10) + lastDigit;
            n=n/10;
        }
        System.out.println(rev);

        //DO-WHILE LOOP
        int counter = 1;//isma phle work hota h then conition check
        do{
            System.out.println("Hello World");
            counter++;
        }// do ka curly brasis khatam hona ka bad hi hum while use kr sakta h
        while(counter <=10);

        //BREAK statement
        for(int i=1; i<=5; i++){
            if(i==3){
                break;//mltb 3 aate hi hm loop sa bhr aa jaynga
            }
            System.out.println(i);
        }
        System.out.println("I am out of the loop");
        //ques: keep entering number until user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("enter your number:");
            int n = sc.nextInt();
            if(n% 10 ==0){
                break;//jaise hi user na 10 ka multiple dia program terminate
            }
            System.out.println(n);
        }
        while(true);

        //CONTINUE STATEMENT
        //QUES: print 1 to 5, skip at 3
        for(int i=1; i<=5;i++){
            if(i==3){
                continue;
            }
            System.out.println(i);
        }
        //ques: except all no.s entered by the user except multiple of 10
        do{
            Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        if(n%10 ==0){
            continue;//10 ka multiple pr program terminate ho jayga
        } 
        System.out.println("number was:" + n);  
        } while(true);

        //QUES: check if a NUMBER is prime or not.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//take n as i/p from user
        if(n==2){
            System.out.println("n is prime");
        }else{
            boolean isPrime = true;//boolean variable to track no. is prime or not
            // we assume no. is prime
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i ==0 ){//n is a multiple of i(i not equal to 1 or n)
            // if n%i ==0 then it's a coposite number;        
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("n is prime");
            }else{
                System.out.println("n is not prime");
            }
        }

        //practice questions
        //WAP that reads set of integers and then prints sum of even 
        //and odd integers.
        Scanner sc= new Scanner(System.in);
        int number;
        int evenSum =0;
        int oddSum =0;
        System.out.print("Enter Number:");
        number =sc.nextInt();
        if(number%2==0){
            evenSum += number;   
        }else{
            oddSum +=number;
        }
            System.out.print("sum of even number is: " + evenSum);
            System.out.println("Sum of Odd numbers is: " + oddSum);*/

            Scanner sc=new Scanner(System.in);
            int number;
            int choice;
            int evenSum=0;
            int oddSum=0;
            do{
                System.out.print("Enter the number ");
                number=sc.nextInt();
                if(number%2==0) {
                    evenSum+=number;
                }else{
                    oddSum+=number;
                }System.out.print("Doyouwanttocontinue?Press1foryesor0forno");
                choice=sc.nextInt();
            }while(choice==1);
            System.out.println("Sum of even numbers: "+evenSum);
            System.out.println("Sum of odd numbers: "+oddSum);

    }
}