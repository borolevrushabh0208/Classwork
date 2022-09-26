package Hash_map;
import java.util.*;
public class Ass_12
{

	public static void main(String[] args)
	{
		  HashMap<Integer,String> map= new HashMap<Integer,String>();

	        map.put(1,"bhushan");
	        map.put(2,"roshan");
	        map.put(3,"anil");
	        map.put(4,"rahul");
	        map.put(5,"chetan");

	        System.out.println(map);

	        System.out.println("Collection view is :"+map.values());
	        
	        
	        HashMap hs=new HashMap();
			hs.put(1, "Hemant");
			hs.put(2, "Ajit");
			hs.put(3, "Ajit");
			hs.put(4, "Atul");
			hs.put(5, "omkar");
			
			Collection c=(ArrayList)new ArrayList<String>(hs.values());
			System.out.println(c);

	}

}
