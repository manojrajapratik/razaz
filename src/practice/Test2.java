package practice;

import java.util.HashMap;

public class Test2 {
	
	String s=null;

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"amit");
		hm.put(2,"rinki");
		
		for(int i=1;i<=hm.size();i++)
		System.out.println(hm.get(i));
	}

}
