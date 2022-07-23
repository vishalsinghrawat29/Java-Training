import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {
        /*
            "name" = "Shashank"
            "rollNo" = "23"
            "DOB" = "12.7.1995"
         */


        /*
            2 = "Shashank"
            43 = "Rahul"
            13 = "Robert"
         */

        Map<Integer, String> namesMap = new HashMap();
        namesMap.put(2, "Shashank");
        namesMap.put(43, "Rahul");
        namesMap.put(13,"Robert");
        namesMap.put(43, "New Name"); // Replace old value , don't have duplicate value

        //access element
        String name = namesMap.get(43);
        System.out.println(name);

        //print all values
        for (Map.Entry entry: namesMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
/*
        Map: Interface
        HashMap: Class that implements interface Pap

        class HashMap implements Map (
            ...
        }

        Map Properties:
            1. They contain values based on key
            2. They are not ordered
            3. They contain unique values
            4. They can only store object type data
 */