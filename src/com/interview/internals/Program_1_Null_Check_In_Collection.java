package com.interview.internals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program_1_Null_Check_In_Collection {

	public static void main(String[] args) {

		System.out.println(" Printing List details ");

		List<Object> list = new ArrayList<>();
		list.add(null);
		list.add(null);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(null);

		System.out.println("list: " + list);

		System.out.println("------------------------------------------------------ ");
		System.out.println("\n Printing Set details ");

		Set<Object> set = new HashSet<>();
		set.add(null);
		set.add(null); // Will not be added again
		set.add(1);
		set.add(2);
		set.add(3);

		System.out.println("set: " + set);

		System.out.println("------------------------------------------------------ ");
		System.out.println("\n Printing Map details ");

		Map<Object, Object> map = new HashMap<>();
		map.put(null, null); // null key with null value
		map.put(1, 2); // 1 as key, 2 as value
		map.put(2, 3); // 2 as key, 3 as value
		map.put(3, null);
		map.put(null, "First"); // null key with string value 
		map.put(null, "Second"); // null key with new string value 
		map.put(null, "Third"); // null key with again new string value 

		System.out.println("map: " + map);

		// map.entrySet().forEach(a -> System.out.println(a.getKey() + ": " + a.getValue()));
		
		// map.forEach((key, value) -> System.out.println(key + ": " + value));

		System.out.println("------------------------------------------------------ ");
	}

}






/*



In Java, a Map allows only one null key, regardless of how many times you try to add a null key with different values.

When you add multiple entries with null as the key, the value associated with the null key will be updated to the latest value you added.


Explanation:

When you add null as the key with the value "null", it is stored in the map.
When you add null again with the value "First", the previous value "null" is replaced with "First".
When you add null again with the value "Second", the previous value "First" is replaced with "Second".
When you add null the third time with "Third", the previous value "Second" is replaced with "Third".
The final state of the map will be {null=Third}, since the map can only store one null key, and the value associated with it will be the last one you added.

In summary, adding multiple null keys to a map will overwrite the previous value associated with null, and only the last one will remain in the map.


*/