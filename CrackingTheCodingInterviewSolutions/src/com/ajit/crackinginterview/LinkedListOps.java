package com.ajit.crackinginterview;

public class LinkedListOps {

	public ListNode head;
	
	public void insertNode(int data, ListNode head) {
		ListNode current = head;
		while(current.next != null) {
			current = current.next;
		}
		ListNode node = new ListNode(data);
		current.next = node;
	}
	
	public void displayList(ListNode head) {
		ListNode current = head;
		while(current != null) {
			System.out.println(current.data+ "\t");
			current = current.next;
		}
	}
	
	public void createList() {
		head = new ListNode(2);
		insertNode(6, head);
		insertNode(3, head);
		insertNode(1, head);
		insertNode(7, head);
		insertNode(6, head);
		insertNode(4, head);
	}
	
	public static void main(String[] args) {
		LinkedListOps ops = new LinkedListOps();
		//ops.displayList(head);
	}

}
