package Hash_map;
import java.util.*;
public class Ass_7
{

	public static void main(String[] args)
	{
		HashMap < String, Integer > hashMap = new HashMap < String, Integer > ();
		    hashMap.put("A", 1);
	        hashMap.put("B", 2);
	        hashMap.put("C", 3);
	        hashMap.put("D",4);
	        hashMap.put("E", 4);
		
		  System.out.println("The Original map: " + hashMap);
		  System.out.println("1. Is key 'Green' exists?");
		  if (hashMap.containsKey("Green")) {
	
		   System.out.println("yes! - " + hashMap.get("Green"));
		  } else {
		   
		   System.out.println("no!");
		  }

		  System.out.println("\n2. Is key 'orange' exists?");
		  if (hashMap.containsKey("orange")) {
		   System.out.println("yes! - " + hashMap.get("orange"));
		  } else {
		   System.out.println("no!");
		  }

	}

}
