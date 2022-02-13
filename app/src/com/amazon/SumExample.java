package com.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SumExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(20);
		list.add(4);
		list.add(7);
		list.add(30);
		
		long k = sum(list);
		System.out.println(k);
	}
	
	public static long sum(List<Integer> list)
	{
		Set<Integer> set = new TreeSet<Integer>();
		for(int i=0; i<list.size(); i++)
		{
			if(i < list.size()-1)
			{
				int k = list.get(i);
				if(list.get(i) < list.get(i+1))
				{
					k = list.get(i)+list.get(i+1);
					list.add(i, k);
					list.remove(list.get(i+1));
					
					i = 0;
				}
				set.add(k);
			}
		}
		
		System.out.println(set);
		List<Integer> ls = new ArrayList<Integer>(set);
		Collections.reverse(ls);
			
		return ls.get(0);
	}
}
