public class palindrome {
    public static void main(String[] args) {
    String str ="malayalam";
    int i=0;
    int j=str.length()-1;
    while(i<j){
        if (str.charAt(i)!=str.charAt(j)){
            System.out.println("not a palindrome");
            return;

        }
        i=i+1;
        j=j-1;
    }
    System.out.println("palindrome");
    }
}
