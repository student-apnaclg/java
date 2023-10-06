import java.io.StreamCorruptedException;

public class RecursionBasics{

    /* 
    public static void printdecreasingnumber(int n){
        if(n==1){ //Base case
            System.out.print(1);
            return;
        }
        System.out.print(n + " "); // n + inner function
        printdecreasingnumber(n-1);// Call inner function-->  f(n-1)
    }
    public static void main(String args[]){
        int n= 10;
        printdecreasingnumber(n);
    }

   //increasing order
     public static void printinc(int n){
        if(n==1){ //Base case
            System.out.print(1);
            return;
        }
        printinc(n-1);// Call inner function-->  f(n-1)
        System.out.print(" "+n + " "); // n + inner function
     }
     public static void main(String args[]){
        int n= 10;
        printinc(n);
    }


    //Factorial of A function
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=fact(n-1);
        int fn = n*fact(n-1);
        return fn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.print(fact(n));
    }


    //Calculate nth term in fibbonachi
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String arg[]){
        int n=25;
        System.out.println(fib(n));
    }

    //find sum of first natural number
    public static int calsum(int n){
        if(n==1){ //base case
            return 1;
        }
        int snm1=calsum(n-1);
        int sn=n+snm1;
        return sn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(calsum(n));
    }

    //Check if given array is sorted or not
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){ //Base case
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.println(issorted(arr,0));
    }
    

    //find first occurance of an element in an array
    public static int firstoccurance(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurance(arr, key, i+1);
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};//output tell the index number of firstoccurance
        System.out.println(firstoccurance(arr,5, 0));
    }


    //find last occurance of an element in an array
    public static int lastoccurance(int arr[],int key , int i){
        if(i==arr.length){
            return -1;
        }
        int isfound = lastoccurance(arr, key, i+1);
        if(isfound==-1&&arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};//output tell the index number of lastoccurance 
        System.out.println(lastoccurance(arr,5, 0));
    }

    //(i)Print x^n
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xnm1=power(x,n-1);//x-1
        int xn = x*xnm1;
        return xn;
    }
    public static void main(String args[]){
        System.out.println(power(2, 10));
    }


    //(ii)Print x^n with optimize code
    public static int optimizepower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfpowersquare=optimizepower(a, n/2)*optimizepower(a, n/2);
        if(n%2!=0){
            halfpowersquare=a*halfpowersquare;
        }
        return halfpowersquare;
    }
    public static void main(String args[]){
        System.out.println(optimizepower(2, 10));
    }


    //upper both code have TIME COMPLEXITY= O(n)
    //(iii)most optimize code with time complexity=O(logn)
    public static int optimizeTC(int a, int n){//optimize time complexity
        if(n==0){
            return 1;
        }
        int halfpower=optimizeTC(a, n/2);
        int halfpowersquare=halfpower*halfpower;
        if(n%2!=0){
            return a*halfpowersquare;
        }
        return halfpowersquare;
    }
    public static void main(String args[]){
        System.out.println(optimizeTC(2, 10));
    }


    //MOST IMPORTANT
    //TILING PROBLEM(AMAZON)
    //Ques-->Given a "2xn" board and tiles of size "2x1" count the number of ways to tile
    //the given board using 2x1 tiles.(can be place horizontally or vertically)
    public static int tilingproblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tilingproblem(n-1);//vertical choice
        int fnm2=tilingproblem(n-2);//horizontal choice
        int totalways=fnm1+fnm2;
        return totalways;
        //or return tilingproblem(n-1)+tilingproblem(n-2);
    }
    public static void main(String args[]){
        System.out.println(tilingproblem(4));//output--> total 5 ways
    }


    have some problem in this code
    //GOOGLE, MICROSOFT
    //Ques--> Remove duplicates in a String
    public static void removeduplicates(String str, int indx,String newStr,boolean map[]){//newstr is a stringbuilder
        if(indx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currentchar= str.charAt(indx);
        if(map[currentchar-'a']==true){
            removeduplicates(str, indx+1, newStr, map);
        }
        else{
            map[currentchar-'a']=true;
            removeduplicates(str, indx+1, newStr.append(currentchar), map);
        }
    }
    public static void main (String args[]){
        String str="aappnnacollege";
        removeduplicates(str, 0, new StringBuilder(" "), new boolean[26]);
    }

    //Goldman sachs
    //Friends pairing problem
    //Ques--> Given n friends, each one can remian single oor can be paired up with some 
    // other friend .each  friend can be paired only once .find out the total number of 
    // ways in which frinds on remain single or can be paired up.
    public static int friendspairing(int n){
        if(n==1||n==2){//base case
            return n;
        }
        int fnm1=friendspairing(n-1);//single
        int fmn2=friendspairing(n-2);//pair
        int pairways=(n-1)*fmn2;
        int totways=fnm1+pairways;
        return totways;//or
       //return friendspairing(n-1)+(n-1)*friendspairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(friendspairing(3));//output --> totalways
    }

    // Binary String problem
    // print all binary strings of size N without consecutive ones.
    public static void printBinstring(int n, int lastplace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinstring(n-1, 0, str+ "0");
        if(lastplace==0){
            printBinstring(n-1, 1, str + "1");
        }
    }
    public static void main(String args[]){
        printBinstring(3, 0, " ");
    }*/

   //Assignment Questions

/* 
    //Assignment question 5
    //Tower of hanoi
    public static void towerofhanoi(int n, char source,char destination,char helper){
        if(n==1){
            System.out.println("move disk" +n+"from" +source+ "to" +destination);
        }
        towerofhanoi(n-1, source, helper, destination);
        System.out.println("move disk" +n+"from" +source+ "to" +destination);
        towerofhanoi(n-1, helper, destination, source);
    }
    public static void main(String args[]){
        int n=3;
        towerofhanoi(n, 'A', 'C', 'B');
    }*/

}

