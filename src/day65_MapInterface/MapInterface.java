package day65_MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {
	
	public static void main(String[] args) {
		
		Map<String, Double> employees = new HashMap<>();
		
		// put():
		employees.put("Nurullah", 10.0);
		employees.put("Alla", 20.0);
		employees.put("Erhan", 500000.0);
		
		System.out.println(employees); // will print in the insertion order
		
		double salary1 = employees.get("Nurullah"); 
		System.out.println(salary1);  // 10.0
		
		System.out.println(employees.get("Erhan")); // 500000.0
		
		employees.remove("Nurullah");
		System.out.println(employees);
		
		System.out.println(employees.size());
		
		boolean a = employees.containsKey("Mahribana");
		System.out.println(a);  // false
		
		boolean b= employees.containsValue(100000.9);
		System.out.println(b);  // false
		
		Set<String> set = employees.keySet();
		System.out.println(set);
		
		Map<String, Integer> map1 = new LinkedHashMap<>();
		   map1.put("A", 100);
		   map1.put("A", 10); // Key cannot be duplicated
		   map1.put("A", 9);
		   map1.put("A", 8);
		   
		   System.out.println(map1);  // will print only A=8, the last value
		   
		   map1.put("B", 8);  // A value CAN be duplicated
		   map1.put(null, null);
		   System.out.println(map1);
		   
		   Hashtable<String, Integer> map2 = new Hashtable<>();
		   // map2.put("A", null);  // no null allowed, throws NullPointerException
		   // System.out.println(map2);
		   
		   TreeMap<String, Integer> map3 = new TreeMap<>();
		   map3.put("Z", 1000);
		   map3.put("X", 90000);
		   map3.put("Y", 80000);
		   
		   System.out.println(map3);  // will print ascending order based on key => X,Y,Z
		   
	}

}
