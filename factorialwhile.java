package day4;

public class factorialwhile {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + num + " is: " + fact);
    }
    
}
