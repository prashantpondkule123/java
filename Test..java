package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("prashant", 36);
		map.put("rushi", 52);
		map.put("adhira", 68);
		map.put("bd", 25);
		map.put("sachin", 52);
		
		Set<String> set = map.keySet();
		ArrayList<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (String k : list) {
			sortedMap.put(k, map.get(k));
		}
		System.out.println(sortedMap);

	}

}
