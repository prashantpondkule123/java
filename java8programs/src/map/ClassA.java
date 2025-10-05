package map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class ClassA {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("prashant", 36);
		map.put("rushi", 52);
		map.put("adhira", 68);
		map.put("bd", 25);
		map.put("sachin", 52);
		
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (String k : map.keySet()) {
//			list.add(map.get(k));
//		}
		
		Collection<Integer> col = map.values();
		ArrayList<Integer> Valuesist = new ArrayList<Integer>(map.values());
		Collections.sort(Valuesist);

		LinkedHashMap<String, Integer> mapSortedValue = new LinkedHashMap<String, Integer>();

		for (int v : Valuesist) {
			for (String k : map.keySet()) {
				if (map.get(k).equals(v)) {
					mapSortedValue.put(k, v);
				}
			}
		}
		System.out.println(mapSortedValue); //{bd=25, prashant=36, sachin=52, rushi=52, adhira=68}

	}
}
