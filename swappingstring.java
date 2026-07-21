package day3;

public class swappingstring {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("sivasakthi");
        char temp = sb.charAt(0);
        sb.setCharAt(0, sb.charAt(sb.length() - 1));
        sb.setCharAt(sb.length() - 1, temp);
        System.out.println(sb);
    }
    
}
