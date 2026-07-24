import java.util.HashSet;
public class HashSetFor {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(40);
        set.add(null);
        set.add(10);

        for (Integer num : set) {
            System.out.println(num);
        }
    }
    
}
