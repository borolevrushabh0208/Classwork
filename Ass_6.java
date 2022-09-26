package Hash_map;
import java.util.*;
public class Ass_6 
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "pune");
		  hash_map.put(2, "bhusawal");
		  hash_map.put(3, "surat");
		  hash_map.put(4, "nagpur");
		  hash_map.put(5, "dhule");
		
		   System.out.println("The Original map: " + hash_map);
		   
		   HashMap<Integer,String> new_hash_map= new HashMap<Integer,String>(); 
		   
		   new_hash_map = (HashMap)hash_map.clone();     
		   System.out.println("Cloned map: " + new_hash_map);    

	}

}
