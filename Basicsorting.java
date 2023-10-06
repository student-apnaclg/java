import java.util.Arrays;
public class Basicsorting{
 /*  //Bubblesort
    public static void bubblesort(int array[]){
        for(int i=0;i<array.length-2;i++){ //i=turn
            for(int j=0;j<=array.length-2-i;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        bubblesort(array);// in both case sorted or in unsorted array have time complexity 
        printarray(array);// O(n^2) bigoh of n square
    }
    

    2nd method with sorted array
    public static void bubblesort(int array[]){
        for(int i=0;i<array.length-2;i++){ //i=turn
            int swap=0;//initialization
            for(int j=0;j<=array.length-2-i;j++){
                swap++;
            }// can skip swap part when array is sorted
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[]={1,2,3,4,5};
        bubblesort(array);
        printarray(array);
    }

    //selection sorting
    public static void selectionsort(int array[]){
        for(int i=0;i<=array.length-2;i++){//i=turn
            int minposition=i;//minposition =current element
            for(int j=i+1;j<=array.length-1;j++){
                if(array[minposition]>array[j]){
                    minposition=j;
                }
            }
            int temp =array[minposition];
            array[minposition]=array[i];
            array[i]=temp;
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] +" ");
        }
    }
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        selectionsort(array);
        printarray(array);
    }


    //Inseretion sort
    public static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){
            int curr=array[i];
            int prev=i-1;
            //find out current position insert
            while(prev>=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;
            }
            //insertion
            array[prev+1]=curr;//for balance if index on -1 index
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String args[]){
        int array[]={5,4,1,3,2};
        Arrays.sort(array,0,3);
       //Arrays.sort(array,0,3,collections.reverseorder()); //for this use OBJECT INTEGER
        //insertionsort(array);
        printarray(array);
    }

    //Counting array
    public static void countingsort(int array[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest=Math.max(largest,array[i]);
        }
        //original array
        int count[]=new int[largest+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }
        //count array
        int j=0;
        for(int i=0;i<array.length;i++){
            while(count[i]>0){
                array[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] +" ");
        }
    }
    public static void main(String args[]){
        int array[]={1,4,1,3,2,4,3,7};
        countingsort(array);
        printarray(array);
    }*/


    //Assiignment Question
    //Sort array in descending order for all sorting technique
    //[3,6,2,1,8,7,4,5,3,1]
    public static void bubblesort(int array[]){
        for(int i=0;i<array.length-2;i++){ //i=turn
            for(int j=0;j<=array.length-2-i;j++){
                if(array[j]<array[j+1]){ // for desecding order
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    //selectionsort
    public static void selectionsort(int array[]){
        for(int i=0;i<=array.length-2;i++){//i=turn
            int minposition=i;//minposition =current element
            for(int j=i+1;j<=array.length-1;j++){
                if(array[minposition]<array[j]){ //for desedcding order
                    minposition=j;
                }
            }
            int temp =array[minposition];
            array[minposition]=array[i];
            array[i]=temp;
        }
    }
    //insertion sort
    public static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){
            int curr=array[i];
            int prev=i-1;
            //find out current position insert
            while(prev>=0 && array[prev]>curr){
                array[prev+1]=array[prev];
                prev--;
            }
            //insertion
            array[prev+1]=curr;//for balance if index on -1 index
        }
    }
    //counting array
    public static void countingsort(int array[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest=Math.max(largest,array[i]);
        }
        //original array
        int count[]=new int[largest+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++;
        }
        //count array
        int j=0;
        for(int i=0;i<array.length;i++){
            while(count[i]>=0){// for descinding order
                array[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int array[]={3,6,2,1,8,7,4,5,3,1};
        bubblesort(array);// in both case sorted or in unsorted array have time complexity 
        selectionsort(array);
        insertionsort(array);
        countingsort(array);
        printarray(array);// O(n^2) bigoh of n square
    }
}