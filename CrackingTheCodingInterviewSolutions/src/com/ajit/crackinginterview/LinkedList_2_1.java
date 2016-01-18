package com.ajit.crackinginterview;

import java.util.Hashtable;

public class LinkedList_2_1 {
	static Hashtable<Integer, Boolean> hashTable;
	
	public static void removeDuplicatesHash(ListNode head) {
		ListNode prev = null;
		hashTable = new Hashtable<Integer, Boolean>();
		while(head != null) {
			if(hashTable.containsKey(head.data)) {
				prev.next = head.next;
			} else {
				hashTable.put(head.data, true);
				prev = head;
			}
			head = head.next;
		}
	}
	
	public static void main(String[] args) {
		LinkedListOps ops = new LinkedListOps();
		ops.createList();
		removeDuplicatesHash(ops.head);
		ops.displayList(ops.head);
	}

}
