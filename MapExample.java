import java.util.*;
public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> mp=new TreeMap<>();
		mp.put(3,"Pune");
		mp.put(6, "mumbai");
		mp.put(4,"Baramati");
		mp.put(2,"Nashik");
		
		for(String m: mp.values())
		{
			System.out.println(m);
		}
		System.out.println("-----------------------------------------------------------");

		for(int k: mp.keySet() )
		{
			System.out.println(k);
		}
		
		for(var h: mp.entrySet())
		{
			System.out.println(h.getKey()+"  "+h.getValue());
		}
//		mp.keySet();
//		System.out.println(mp);
//		mp.entrySet();
//		System.out.println(mp);
//		for(var k:)
//		{
//			System.out.println();
//		}
	}

}
