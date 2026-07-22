package day5;
import java.util.Stack;
 class reversestack {
    public static void main(String[] args) {
        
        Stack stack = new Stack();

        String str = "sivasakthi";

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}