package com.amazon;

import java.util.HashSet;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println(distinctLetters("good"));
	}
	   
    private static int distinctLetters(final String input) {
        char[] inputArray = input.toCharArray();
        int total = 0;
        for (int i = 0; i < inputArray.length; i++) {
            int count = 1;
            Set<String> lookup = new HashSet<>();
            lookup.add(String.valueOf(inputArray[i]));
            for (int j = i+1; j < inputArray.length; j++) {
                lookup.add(String.valueOf(inputArray[j]));
                count+=lookup.size();
            }
            total+=count;
        }
        return total;
    }
}
