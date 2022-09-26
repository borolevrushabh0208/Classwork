package Hash_map;
import java.util.*;
public class Ass_8 
{

	public static void main(String[] args)
	{
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		  
      
        hash_map.put(10, "Vrushabh");
        hash_map.put(15, "bhushan");
        hash_map.put(20, "mahendra");
        hash_map.put(25, "sunil");
        hash_map.put(30, "Anil");
  
        System.out.println("Initial Mappings are: " + hash_map);
  
 
        System.out.println("Is the key '20' present? " + 
        hash_map.containsKey(20));
  
      
        System.out.println("Is the key '5' present? " + 
        hash_map.containsKey(5));

	}

}
