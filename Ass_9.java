package Hash_map;
import java.util.*;
public class Ass_9 
{

	public static void main(String[] args)
	{
		HashMap<Integer, String> name = new HashMap<>();

	    name.put(1, "omkar");
	    name.put(2, "hemant");
	    name.put(3, "bhushan");
	    System.out.println("rahul: " + name);

	    
	    System.out.println("Keys: " + name.keySet());

	    
	    System.out.println("Values: " + name.values());

	    
	    System.out.println("Key/Value mappings: " + name.entrySet());
	}

}
