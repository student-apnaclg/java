//classes and object
/* 
class Pen{ //class name --> always starts with Capital letter
    String color;//property
    int tip;//property
    void setcolor(String newcolor){ //function
        color=newcolor;
    }
    void settip(int newtip){  //function
        tip=newtip; 
    }
}
public class Opps{
    public static void main(String args[]){
        Pen p1=new Pen();//constructor and p1 is an object
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip('5'); //don't use double couts here ,if use then it become string and give error
        System.out.println(p1.tip);   
    }
}*/


//Access modifiers , public and private properties
class Bankaccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }  
}
public class Opps{
    public static void main(String args[]){
        Bankaccount myAcc=new Bankaccount();
        myAcc.username="Nandiniverma";
        myAcc.setpassword("abcd");
        System.out.println(myAcc.username);
    }
}



   /* 
    public static void main(String args[]){
        Calculator calc= new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1.5f,2.5f));
        System.out.println(calc.sum(1,2,3));
    }
}
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a , float b){
        return a+b;
    }
    int sum(int a , int b , int c){
        return a+b+c;
    }
}*/