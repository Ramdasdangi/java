package collage.Hashing;
import java.util.*;

public class hashmap {
    public static void main(String[] arg){

        // creation
        HashMap<String , Integer> map=new HashMap<>();

        // inseration
        map.put("India",120);
        map.put("china",150);
        map.put("US",50);

        System.out.println(map);

        // value change
        map.put("china",200);
        System.out.println(map);

        // searching
        if(map.containsKey("Indonesia"))
            System.out.println("key is exist ");
        else
            System.out.println("key is not exist ");

        System.out.println(map.get("china"));  // return its value
        System.out.println(map.get("Indonesia"));  // return null value bcz key not exist

        // Iteration 1st type
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
        }

        // Iteration 2nd type
        Set<String> keys = map.keySet();
        for(String a : keys){
            System.out.print(a+" : "+map.get(a)+"  ");
        }
        System.out.println();

        //Remove both key and value pair
        map.remove("china");
        System.out.println(map);
    }
}
