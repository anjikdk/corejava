package com.amazon;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Test main = new Test();
        System.out.println(main.combinationCount("test"));
         System.out.println(main.combinationCount("good"));
    }
    
    Map<String, Integer> map;
    
    public  int combinationCount(String s) {
        map  = new HashMap<>();
        fillMap(s);
        int count = 0;
        for (int i: map.values()) {
            count += i;
        }
        System.out.println(map);
        return count;
    }
    
    public  void fillMap(String s) {
        if (s.length() == 0) return ;
        // System.out.println(s);
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i);
            if (!map.containsKey(str)) {
            	boolean b = false;
            	for(int k=0; k<str.length()-1; k++)
            	{
            		if(str.charAt(k) == str.charAt(k+1))
            		{
            			b = true;
            		}
            	}
            	if(b)
            		map.put(str, str.length()-1);
            	else
            		map.put(str, str.length());
            }
            fillMap(s.substring(i + 1));
            fillMap(str.substring(1));
        }
    }
}
