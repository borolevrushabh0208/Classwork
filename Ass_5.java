package Hash_map;
import java.util.*;
public class Ass_5
{

	public static void main(String[] args)
	{
		HashMap <Integer,String> newmap = new HashMap <Integer,String> ();
		newmap.put(1, "vrushabh");
	      newmap.put(2, "bhushan");
	      newmap.put(3, "prashant");
	      newmap.put(4, "Rahul");
	      newmap.put(5, "Amit");
	      newmap.put(6, "kunal");
	      newmap.put(7, "Ankit");
		  
		  boolean result = newmap.isEmpty();
		
		  System.out.println("Is hash map empty: " + result);
	
		  newmap.clear();
	
		  result = newmap.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);

	}

}
