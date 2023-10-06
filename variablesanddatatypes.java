import java.util.Scanner;

public class variablesanddatatypes{
    public static void main(String args[]){
      //question 1
      Scanner sc = new Scanner(System.in);
      /*int A = sc.nextInt();
      int B = sc.nextInt();
      int C = sc.nextInt();
      int Average = (A+B+C)/3;
      System.out.println("Average is " + Average);
      
      //Question 2
      int side = sc.nextInt();
      int area = side*side ;
      System.out.println("area of square is "+ area);*/

      //Question 3
      float pencil = sc.nextFloat();
      float pen = sc.nextFloat();
      float eraser = sc.nextFloat();
      float Bill = pencil+pen+eraser;
      //add 18% GST
      float Newtotal = Bill +(0.18f * Bill);
      System.out.println("Total Bill is " + Bill);
      System.out.println("Total Bill with 18% Gst is "+ Newtotal);
    }
}