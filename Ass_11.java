package Hash_map;
import java.util.*;
public class Ass_11 
{

	public static void main(String[] args)
	{
		
		   
		   HashMap hs=new HashMap();
			hs.put(1, "bhushan");
			hs.put(2, "kanha");
			hs.put(3, "Akash");
			hs.put(4, "Amit");
			
			Set<Integer> s=hs.keySet();
			System.out.println("Set of keys: "+s);

	}

}
