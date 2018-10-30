package xzj.datastracture.linkedlist;

import org.junit.Test;

public class Mytest {
	@Test
	public void test1() throws Exception {
		MyLinkedList linkedList = new MyLinkedList();
		linkedList.addAtHead(1);
		linkedList.addAtTail(2);
		linkedList.addAtTail(3);
		linkedList.addAtTail(4);
		linkedList.addAtIndex(2, 5);  // linked list becomes 1->2->3
		//System.out.println(linkedList.next.val);
		
		linkedList.get(2);            // returns 2
		//linkedList.deleteAtIndex(1);  // now the linked list is 1->3
		System.out.println("====");
		while(linkedList!=null) {
			System.out.println(linkedList.val);
			linkedList=linkedList.next;
		}
	}
	@Test
	public void test2() throws Exception {
		MyLinkedList head = new MyLinkedList();
		MyLinkedList node2 = new MyLinkedList();
		System.out.println(node2);
		MyLinkedList node3 = new MyLinkedList();
		MyLinkedList node4 = new MyLinkedList();
		head.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node2;
		MyLinkedList list = Cycle.detectCycle(head);
		System.out.println(list);
	}
}
