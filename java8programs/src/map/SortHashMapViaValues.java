package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapViaValues {

	public static void main(String[] args) {

HashMap<String, Integer> map = new HashMap<String, Integer>();
map.put("prashant", 36);
map.put("rushi", 52);
map.put("adhira", 68);
map.put("bd", 25);

System.out.println(map.entrySet()); //[bd=25, prashant=36, adhira=68, rushi=52]


// Convert entrySet to List
List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
System.out.println(list); //[bd=25, prashant=36, adhira=68, rushi=52]

// ✅ Manual sorting using nested for-loops (ascending order)
for (int i = 0; i < list.size() - 1; i++) {
    for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).getValue() > list.get(j).getValue()) {
            // swap
            Map.Entry<String, Integer> temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}

System.out.println("Ascending order:");
for (Map.Entry<String, Integer> entry : list) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}

System.out.println(map);

// ✅ Manual sorting using nested loops (descending order)
for (int i = 0; i < list.size() - 1; i++) {
    for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).getValue() < list.get(j).getValue()) {
            // swap
            Map.Entry<String, Integer> temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}

System.out.println("\nDescending order:");
for (Map.Entry<String, Integer> entry : list) {
    System.out.println(entry.getKey() + " = " + entry.getValue());
}
	}

}
