package yess;

import java.util.HashMap;


public class Data {

	public static HashMap<String, String> getuserdata()
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("admin", "venke444_venkat444");
		return hm;
	}
	
	public static HashMap<Integer, String> monthmap()
	{
		HashMap<Integer, String> dat=new HashMap<Integer, String>();
		
		dat.put(1, "jan");
		dat.put(2, "Feb");
		dat.put(3, "Mar");
		dat.put(4, "Apr");
		dat.put(5, "May");
		dat.put(6, "Jun");
		dat.put(7, "jul");
		dat.put(8, "Aug");
		dat.put(9, "Sep");
		dat.put(10, "Oct");
		dat.put(11, "Nov");
		dat.put(12, "Dec");
		
		return dat;
		
	}
	
	
	
}
