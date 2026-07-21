public class small {
    public static void main (String[]args){ 
    
        int[] arr ={6,8,2,4,5,9};
        int min= arr[0];
        for(int i=1 ; i<arr.length;i++){
            if (arr [i] < min){
                min=arr[i];
            }

        }
        System.out.println (min);
        }
        

    }
