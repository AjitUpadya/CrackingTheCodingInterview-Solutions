package com.ajit.crackinginterview;

public class LinkedList_2_2 {
	
	public static int recursiveFindKthFromLast(ListNode cur, int k) {
		//when last elem is reached
		if(cur == null) {
			return 0;
		}
		int i = recursiveFindKthFromLast(cur.next, k) + 1;
		if(i == k) {
			System.out.println(cur.data);
		}
		return i;
	}

	public static int findKthFromLast(ListNode head, int k) {
		ListNode ptr1 = head, ptr2 = head;
		int size = 0, ctr = 0;
		while(ptr2 != null) {
			size++;
			ptr2 = ptr2.next;
		}
		while(ctr <= size-k-1) {
			ptr1 = ptr1.next;
			ctr++;
		}
		return ptr1.data;
	}
	
	public static void deleteMiddleNode(ListNode cur) {
		while(cur.next.next != null) {
			cur.data = cur.next.data;
			cur = cur.next;
		}
		cur.data = cur.next.data;
		cur.next = null;
	}
	
	public static void main(String[] args) {
		LinkedListOps ops = new LinkedListOps();
		ops.createList();
		System.out.println(findKthFromLast(ops.head, 1));
		recursiveFindKthFromLast(ops.head, 1);
		deleteMiddleNode(ops.head.next.next);
		ops.displayList(ops.head);
	}

}
