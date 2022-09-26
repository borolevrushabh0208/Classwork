package Hash_map;
import java.util.*;
public class Ass_10
{

	public static void main(String[] args)
	{
		HashMap obj=new HashMap();
		Scanner in=new Scanner(System.in);
		obj.put(1, "captain america");
		obj.put(2, "Thor");
		obj.put(3, "Iron-man");
		obj.put(4, "Blackwidow");
		obj.put(5, "Hawkeye");
		obj.put(6, "Hulk");
		
		System.out.println(obj);
		
		System.out.println("enter any valid key to get the value :");
		int key=in.nextInt();
		
		System.out.println("the value is ="+obj.get(key));
	}

}
