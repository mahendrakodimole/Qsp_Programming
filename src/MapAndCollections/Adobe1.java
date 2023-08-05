package MapAndCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Adobe1 {
	public static void main(String[] args) {
		//compare values of list with values in map if map contains any value present in list print the keys
		
		ArrayList<Integer> list =new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(6);
		list.add(13);
		
		Map<String,Integer> map=new HashMap<>();
		map.put("A", 10);
		map.put("B", 15);
		map.put("C", 30);
		map.put("D", 20);
	
		map.entrySet().stream().filter(s->list.contains(s.getValue())).forEach(s->System.out.println(s.getKey()));

		//compare  keys of 2 map if keys are same print the key & value which has high value
		Map<String,Integer> map1=new HashMap<>();
		map1.put("D", 10);
		map1.put("C", 15);
		map1.put("E", 30);
		map1.put("A", 20);
		
		for (Map.Entry<String, Integer> set: map.entrySet()) {
			String key=set.getKey();
			if(map1.containsKey(key)) {
				if(set.getValue()>=map1.get(key)){
					System.out.println(key+" "+set.getValue());
				}else {
					System.out.println(key+" "+map1.get(key));
				}
			}
		}

}
}

