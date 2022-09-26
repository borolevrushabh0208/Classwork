//Write a Java program to count the number of key-value (size) mappings in a map.

package Hash_map;
import java.util.*;
public class Ass_2
{

	public static void main(String[] args) 
	{
		 HashMap newmap = new HashMap();      

	      // populate hash map
	      newmap.put(1, "vrushabh");
	      newmap.put(2, "bhushan");
	      newmap.put(3, "prashant");
	      newmap.put(4, "Rahul");
	      newmap.put(5, "Amit");
	      newmap.put(6, "kunal");
	      newmap.put(7, "Ankit");

	      System.out.println("Size of the map: "+ newmap.size());
	   
	}

}
