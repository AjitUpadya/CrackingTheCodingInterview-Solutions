package com.ajit.crackinginterview;

public class UniqueCharsInString {
	
	public static boolean isUniqueChars(String s) {
		int ctr = 0;
		for(int i=0; i<s.length(); i++) {
			ctr = 0;
			for(int j=0; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					ctr++;
				}
				if(ctr > 1)	return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isUniqueChars("abcd"));
		System.out.println(isUniqueChars("abcad"));
		System.out.println(isUniqueChars("abcdefghijklmnop"));
		System.out.println(isUniqueChars("pabcdefghijklmnop"));
	}

}
