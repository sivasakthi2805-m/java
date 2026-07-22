package day4;

public class binarysearch {
 
public static void main(String[] args) { 
    
    int [] arr ={1,8,5,9,4};
    int target = 9;
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid =  (right + left) / 2;
        if (arr[mid] == target) {
            System.out.println("element found at index: " + mid);
            return;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    System.out.println("element not found:");
    

}


}
 
    
            
