package day4;
public class linearsearch {
    public static void main(String[] args) {
        int [] arr ={1,8,5,9,4};
        int target = 9;
        for (int i =0;i<arr.length;i++){
        if (arr[i] == target){
            System.out.println("element found at index: "+ i);
            return;
        }
        }
      System.out.println("element not found:");
    }  
} 


