package array;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class CountDistinct {
	
	public static void main(String[] args) {
		
		addNumber();
		
	}
	public static void addNumber() {

		int ar[]= {10,30,20,10,30,20,40,540,20};
		
		
		LinkedHashMap<Integer, Integer> lhm=new LinkedHashMap<Integer , Integer>();
		
		for(int i=0;i<ar.length; i++)
		{
			if(lhm.containsKey(ar[i])==false)
			{
				lhm.put(ar[i], 1);
			}
			else
			{
				int old =lhm.get(ar[i]);
				lhm.put(ar[i], old+1);
			}
		}
		System.out.println(lhm);
	}

}
