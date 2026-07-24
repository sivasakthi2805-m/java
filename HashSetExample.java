
import java.util.HashSet;
public class HashSetExample {
public static void main (String[]args){
    HashSet <Integer> Set = new HashSet<>();
    Set.add(10);
    Set.add(20);
    Set.add(30);
    Set.add(10);
    Set.add(40);
    Set.add(null);
    Set.add(10);
    System.out.println(Set);
    System.out.println(Set.contains (20));
    Set.remove(20);
    System.out.println(Set);
    System.out.println("size:"+Set.size());





}

    
}
