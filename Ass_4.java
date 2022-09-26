package Hash_map;
import java.util.*;
public class Ass_4 
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
		
		  System.out.println("The Original linked map: " + newmap);
		  
		  newmap.clear();
		  System.out.println("The New map: " + newmap);

	}

}
