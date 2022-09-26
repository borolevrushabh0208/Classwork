//Write a Java program to associate the specified value with the specified key in a HashMap.
package Hash_map;
import java.util.*;
public class Assi_1 
{

	public static void main(String[] args)
	{
		HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "vrushabh");
		  hash_map.put(2, "bhushan");
		  hash_map.put(3, "Rahul");
		  hash_map.put(4, "bhushan");
		  hash_map.put(5, "tushar");
		  for(Map.Entry x:hash_map.entrySet())
		   {  
		        System.out.println(x.getKey()+" "+x.getValue());  
		   }  
	}

}
