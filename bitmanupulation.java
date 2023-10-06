public class bitmanupulation{
    /* 
    //Check if a number is odd or even
    public static void oddoreven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String args[]){
        oddoreven(5);
        oddoreven(6);
    }


    //(i)GET ith bit
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getithbit(10,3));
    }

    //(ii)SET ith bit
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    public static void main(String args[]){
        System.out.println(setithbit(10,2));
    }

    //(iii)CLEAR ith bit
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }

//    public static void main(String args[]){
//        System.out.println(clearithbit(10,1));
//    }

    //update ith bit
    public static int updateithbit(int n,int i, int newbit){
        n=clearithbit(n,i);
        int bitmask=newbit<<i;
        return n|bitmask;
    }
    public static void main(String args[]){
        System.out.println(updateithbit(10,2,1));
    }


    //clear last i bits
    public static int clearlastithbits(int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearlastithbits(15,2));
    }

    //clear range of bits
    public static int clearbitsinrange(int n,int i,int j){
       int a=((~0)<<(j+1));
       int b=(1<<i)-1;
       int bitmask=a|b;
       return n& bitmask;
    }
    public static void main(String args[]){
        System.out.println(clearbitsinrange(10,2,4));
    }

    //check if a number is a power of 2 or not
    public static boolean ispowerof2(int n){
        return (n&(n-1))==0;
    }
    public static void main(String args[]){
        System.out.println(ispowerof2(16));
    }

    //count set bits in a number(important)
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){//if LSB=1(or a non zero number)
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countsetbits(10));
    }

    //FAST EXPONENTIATION
    public static int fastexponentiation(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){//if LSB=1(or a non zero number)
                ans =ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.println(fastexponentiation(3,5));//3^5
    }

    //ASSIGNMENT QUESTIONS
    
    //QUES 1: Swap two numbers without using any three variable
    public static void main(String args[]){
        int x=3,y=4;
        System.out.println("before swap x is: "+x+" and y is: "+y);
        x=x^y;//XOR gives zero when bits are same
        y=x^y;
        x=x^y;
        System.out.println("after swap x is: "+x+" and y is: "+y);
    }

    //QUES 2:add 1 to an integer using bit manipulation(-x=~x+1)==>(-~x=x+1)
    public static void main(String args[]){
        int x=6;
        System.out.println(x+" + "+1+"is "+ -~x);
        x=-4;
        System.out.println(x+" + "+1+"is "+ -~x);
        x=0;
        System.out.println(x+" + "+1+"is "+ -~x);   
    }*/
    
    //QUES 3: convert uppercase letters to lowercase using bits.
    public static void main(String args[]){
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch|' '));
        }
    }
}