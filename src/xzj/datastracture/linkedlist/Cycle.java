package xzj.datastracture.linkedlist;

public class Cycle {
	// 判断环状链表是否存在
	public static boolean hasCycle(MyLinkedList head) {
		MyLinkedList slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	// 判断换装链表是否存在，存在则返回环状节点起点，否则返回null
	public static MyLinkedList detectCycle(MyLinkedList head) {
		MyLinkedList slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				break;
		}
		if(fast == null || fast.next == null) {
			return null;
		}
		//第一次相遇后令fast回归起点，并让其速度为1.再次相遇后即为环状起点
		fast=head;
		while(true) {
			if(fast==slow) {
				break;
			}
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow;
	}
}
