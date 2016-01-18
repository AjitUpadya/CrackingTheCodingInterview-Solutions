package com.ajit.crackinginterview;

import java.util.HashMap;
import java.util.Set;

public class Codility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 1,3,1,4,2,5 };
		//System.out.println(findOddOccurence(a, 7));
		//System.out.println(findOddOccurenceBitwise(a, 7));
		//System.out.println(method22(a, 7, 3));
		System.out.println(method22(a, 7, 6));
		
		
		
	}

	public static int method22(int[] A, int X, int D) {
		if(D >= X)	return 0;
		int curPos = 0;
		
		for(int i=0; i< A.length; i++) {

			//consider the next move only if the leaf position is greater than the current position
			if(curPos < A[i] && (curPos + D) >= A[i]) {
				curPos = A[i];
			}
			//if X can be reached with a jump of distance D, then return the index 
			if(curPos + D >= X) {
				return i;
			}	
		}
		return -1;
	} 
	
	public static int findOddOccurenceBitwise(int A[], int N) {
		int res = 0;
		
		for(int a : A) {
			res = res ^ a;
		}
		return res;
	}
	
	public static int findOddOccurence(int A[], int N) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<A.length; i++) {
			if(!map.containsKey(A[i])) {
				map.put(A[i], 1);
			} else {
				int cnt = map.get(A[i]);
				map.put(A[i], cnt + 1);
			}
		}
		Set<Integer> set = map.keySet();
		for(Integer i : set) {
			if(map.get(i) == 1) {
				return map.get(i);
			}
		}
		return 0;
	}
	//accepted
		public static int binaryGap(int N) {
			String str = Integer.toBinaryString(N);
			String[] a = str.trim().split("");
			int maxGap = 0;
			int finalGap = 0;
			boolean begin = false;
			for(String s : a ) {
				if(s.equalsIgnoreCase("1")) {
					if(begin) {
						if(maxGap > finalGap) {
							finalGap = maxGap;
							maxGap = 0;
							begin = true;
						} else if(maxGap == 0){
							continue;
						} else {
							begin = false;
						}
					} else {
						maxGap = 0;
						begin = true;
					}
				}
				if(begin) {
					if(s.equalsIgnoreCase("0")) {
						maxGap++;
					}
				}
			}
			return finalGap;
		}
		static StringBuffer sb = new StringBuffer();
		public static void printBinaryform(int number) {
			while(number > 0) {
				sb.append(number % 2);
				number = number/2;
			}
			System.out.println(sb.reverse().toString());
			
		}
		
		public static int frogJump(int X, int Y, int D) {
			//base cases
			if(Y-X == 0)	return 0;
			if(D == 1)	return Y-X;
			
			//if the remainder is 0, then return Y/D
			if((Y-X) % D == 0) {
				return Y/D;
			} else {
				return (Y-X)/D + 1;
			}
	    }
		
		public static int sampleTest(int[] arr) {
			int n = arr.length;
			if (n==0) return -1; 
		    long sum = 0;
		    int i; 
		    for(i=0;i<n;i++) sum+=(long) arr[i]; 
	
		    long sum_left = 0;    
		    for(i=0;i<n;i++) {
		        long sum_right = sum - sum_left - (long) arr[i];
		        if (sum_left == sum_right) return i;
		        sum_left += (long) arr[i];
		    } 
		    return -1; 
	    }

}
