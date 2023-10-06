  public class patterns_part2 {
    /*public static void hollow_rectangle(int totrows, int totcols){
        for(int i=1;i<=totrows;i++){//outer loop, i=line=rows
            for(int j=1;j<=totcols;j++){//innerloop(for coloum), j=col.
                if(i==1||i==totrows ||j==1||j==totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();//after completing inner loop
        }
    }
    public static void main(String args[]){
        hollow_rectangle(5,5);
    }*/
    public static void Inverted_Rotated_Half_Pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
           }System.out.println();
        }  
    }
    public static void main(String args[]){
        Inverted_Rotated_Half_Pyramid(7);
    }
}
