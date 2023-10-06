import java.util.Scanner;

public class twoDarray{
    /* 
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        int n= matrix.length;int m= matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j= 0;j<m;j++){
                matrix[i][j]=sc.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // to search an element
    //take input from user and then find the position of the element
    public static boolean search(int matrix[][] ,int key){ 
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.print("found at cell ("+ i+ " ,"+j + " )");
                    return true;
                }
            }
        }
        System.out.print("key not found");
        return false;
    }
    public static void main(String args[]){
       int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j= 0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
       search(matrix,9);        
    }
 
    //Spiral matrix
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcol=0;
        int endrow=matrix.length-1;//n-1
        int endcol=matrix[0].length-1;//m-1
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j= startcol;j<=endcol;j++){
                System.out.print(matrix[startrow][j]+ " ");//here startrow is fix
            }
            //right
             for(int i= startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcol]+ " ");//here endcol is fix
            }
            //bottam
             for(int j= endcol-1;j>=startcol;j--){
                if(startrow==endrow){//for last cell or odd number martix
                    break;
                }
                System.out.print(matrix[endrow][j]+ " ");//here endrow is fix
            }
            //left
             for(int i= endrow-1;i>=startrow+1;i--){
                 if(startcol==endcol){//for last cell or odd number martix
                    break;
                }
                System.out.print(matrix[i][startcol]+ " ");//here startcol is fix
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printspiral(matrix);
    }

    //Diagonal sum
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        for (int i=0;i<matrix.length;i++){
            //primary diagonal
            sum+=matrix[i][i];//here i==j
            //for not repeat overlapping element
            if(i!=matrix.length-1-i)//calculate Secondary Diagonal only if i!=j
                //secondary diagonal
                sum+=matrix[i][matrix.length-1-i];
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalsum(matrix));
    }

    //STAIRCASE SEARCH
    public static boolean staircase(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if (matrix[row][col]==key){
                System.out.println("found key at(" + row + "," + col +")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;//move to LEFT
            }
            else{
                row++;//move to BOTTAM
            }
        }
        System.out.println("key not found") ;
        return false; 
    }
    public static void main(String args[]){
         int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
         staircase(matrix,33);
    }


    //ASSIGNMENT QUESTIONS

    //QUES 1:PRINT NUMBER OF 7's THAT ARE IN 2D array.
   
    public static void main(String args[]){
       int array[][]={{4,7,8},{8,8,7}};
       int countof7 =0;//variable to check if 7 present or not
       for(int i=0;i<array.length;i++){
         for(int j=0;j<array[0].length;j++){
            if(array[i][j]==7){
                countof7++;
            }
         }
       }
       System.out.print("count of 7 is : " +countof7);        
    }

    //QUES 2: Print out the sum of numbers in the second row of the "nums" array
    public static void main(String args[]){
        int nums[][]={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        //sum of 2nd row of element
        for(int j=0;j<nums.length;j++){//here j=column , use j since col are varying
            sum+=nums[1][j];//here row 1 is fix
            //indexing of row
            //0th --> 1st row as per question
            //1st --> 2nd row as per question
            //2nd --> 3rd row as per question
        }
        System.out.println("sum is: " + sum);
    }*/

    //QUES 3:Program to find Transpose of a matrix
    public static void printmatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int row=2 , col=3;
        int matrix[][]={{2,3,7},{5,6,7}};
        printmatrix(matrix);
        System.out.println();
        int transpose[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        printmatrix(transpose);
    }
}