public class array {
        //passing arrays as an argument
        /*public static void update(int marks[]){
        for(int i= 0; i<marks.length;i++){
              marks[i]=marks[i]+1;
            }
        }
        public static void main(String args[]){
            int marks[]={97,98,99};
            update(marks);
            for(int i= 0; i<marks.length;i++){
                System.out.print(marks[i] + " ");
            }
        }

        //Linear search
        public static int Linearsearch(int numbers[], int key){
            for(int i=0;i<numbers.length;i++){
              if(numbers[i]==key){
                return i;//agar kisi index pr key milti h to give index value
              }
            }
                return -1;// agar kisi index pr nhi milti to -1 return karo
        }
        public static void main (String args[]){
            int numbers[]={2,4,6,8,10,12,14,16};
            int key= 10;
            int index= Linearsearch(numbers,key);//call linearsearch and save it in index 
            if(index==-1){
                System.out.println("NOT FOUND");
            }else{
                System.out.println("key is at the index :" + index);
            }
        }

        //Binary search
        public static int Binarysearch(int numbers[],int key){
            int start=0, end= numbers.length-1;
            while(start<=end){
                int mid =(start+end)/2;
                if(numbers[mid]==key){//found
                    return mid;
                }
                if(numbers[mid]<key){//right
                    start=mid+1;
                }else{
                    end=mid-1;//left
                }
            }
            return -1;
        }
        public static void main(String args[]){
            int numbers[]={2,4,6,8,10,12,14};
            int key=10;
            int index= Binarysearch(numbers,key);
            System.out.println("Key is at index:" + index);
        }*/
        
        //Assignment question
        //QUE: return true, if any value appears at least twice in the array,and return
        //false if every element is distinct.
        public boolean duplicate(int[] numbers){
            for(int i=0;i<numbers.length;i++){
                for(int j=i+1;j<numbers.length;j++){
                    if(numbers[i]==numbers[j]){
                        return true;
                    }
                }
            }return false;
        }
        public static void main(String args[]){
            int numbers[]={1,1,1,2,3,4,2,3,4};
            System.out.print( numbers[]);
        }

    }