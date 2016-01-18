package com.ajit.crackinginterview;

public class QuicksortList {

	public static ListNode quicksort(ListNode head, int x) {
		ListNode smallerHead = null;
		ListNode greaterHead = null;
		ListNode smallerCur = null;
		ListNode greaterCur = null;
		ListNode cur = head;
		//for()
		while(cur != null) {
			if(cur.data <= x) {
				if(smallerHead != null) {
					while(smallerCur.next != null)	smallerCur = smallerCur.next;
					smallerCur.next = new ListNode(cur.data);
				} else {
					smallerHead = new ListNode(cur.data);
					smallerCur = smallerHead;
				}
			} else {
				if(greaterHead != null) {
					while(greaterCur.next != null)	greaterCur = greaterCur.next;
					greaterCur.next = new ListNode(cur.data);
				} else {
					greaterHead = new ListNode(cur.data);
					greaterCur = greaterHead;
				}
			}
			cur = cur.next;
		}
		// merge the two arrays
		smallerCur.next = new ListNode(x);
		smallerCur.next.next = greaterHead;
		return smallerHead;
	}
	
	
	
	public static void main(String[] args) {
		LinkedListOps ops = new LinkedListOps();
		ops.createList();
		ListNode newHead = quicksort(ops.head, 3);
		ops.displayList(newHead);
	}

}
