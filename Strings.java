public class Strings{
/* 
    //print letters
    public static void printletters(String Str){
        for(int i=0;i<Str.length();i++){
            System.out.print(Str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        String firstname="Nandini";
        String lastname="Verma";
        String fullname=firstname+" "+lastname;
        printletters(fullname);
    }

    //Check if a string is palindrome
    public static boolean ispalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String str="nandini";
        System.out.println(ispalindrome(str));
    }

    //QUESTION 2:A route containing 4 directions,find shortest path to reach destination.
    public static float getshortestpath(String path){
        int x=0, y=0;
        for(int i=0;i<path.length();i++){
            char direction =path.charAt(i);
            //south
            if(direction=='s'){
                y--;
            }
            //north
            else if(direction=='n'){
                y++;
            }
            //east
            else if(direction=='e'){
                x++;
            }
            //west
            else{
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return(float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String path="wneenesennn";
        System.out.println(getshortestpath(path));
    }

    //.equals -->for String comparison
    public static void main(String args[]){
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");
        if(s1.equals(s3)){
            System.out.print("String are equal");
        }
        else{
            System.out.print("String are not equal");
        }
    }

    //Substring
    public static String substring(String str,int si,int ei){
        String substr=" ";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str="Hello world";
        System.out.print(substring(str,0,5));
    }

    //In-built java substring
    public static void main(String args[]){
        String str="Hello world";
        System.out.print(str.substring(0,5));
    }


   //QUESTION 3: for a given set of stings, print the largest string
   public static void main(String args[]){
    String fruits[]={"apple","mango","banana"};//in LEXICOGRAPHIC
    String largest=fruits[0];
    for(int i=1;i<fruits.length;i++){
        if(largest.compareTo(fruits[i])<0){
            largest=fruits[i];
        }
    }
    System.out.print(largest);
   }

   //STRING BUILDER
   public static void main(String args[]){
    StringBuilder sb = new StringBuilder("");
    for(char ch='a';ch<='z';ch++){
        sb.append(ch);
    }
    System.out.println(sb);
    System.out.println(sb.length());
   }*/


   //QUESTION 4:for the given string convert each of the first letter of each word to
   //uppercase.
   public static String touppercase(String str){
    StringBuilder sb= new StringBuilder("");
    char ch= Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        if(str.charAt(i) ==' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
        }
        else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
   }
   public static void main(String args[]){
    String str="hi, i am nandini";
    System.out.print(touppercase(str));
    }

}