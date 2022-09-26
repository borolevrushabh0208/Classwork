// Write a Java program to copy all of the mappings from the specified map to another map.
package Hash_map;
import java.util.*;
public class Ass_3 
{

	public static void main(String[] args) 
	{
		 Map<String, Integer> hashMap = new HashMap<>();
		 
	        hashMap.put("A", 1);
	        hashMap.put("B", 2);
	        hashMap.put("C", 3);
	        hashMap.put("D",4);
	        hashMap.put("E", 5);
	         System.out.println(hashMap);
	        Map<String, Integer> second_map = hashMap;
	 
	        System.out.println(second_map);
	}

}
