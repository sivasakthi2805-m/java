import java.util.HashMap;
import java.util.Map;

public class frequenceycount {
    public static void main(String[] args) {
        
        String str = "aabccda";
        HashMap<Character,Integer> map= new HashMap<>();
         for(int i=0;i<str.length();i++){
            char Key= str.charAt(i);
            map.put(Key,map.getOrDefault(Key, 0)+1);{

         for(Map.Entry<Character,Integer> entry:map.entrySet()){
          System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
         }
         }
         }
         }
    
}
