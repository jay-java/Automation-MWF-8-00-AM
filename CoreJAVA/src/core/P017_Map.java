package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P017_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");// entry
		map.put("c++", 2);
		map.put(3, "java");
		map.put(false, 'r');
		map.put(345.435, "php");
		map.put(6, "python");
		System.out.println(map);

		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			Map.Entry entry = (Entry) itr.next();
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}

	}
}
