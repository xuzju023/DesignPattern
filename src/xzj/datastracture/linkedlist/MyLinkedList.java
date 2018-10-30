package xzj.datastracture.linkedlist;

public class MyLinkedList {
	Integer val;
	MyLinkedList next;


	/** Initialize your data structure here. */
	public MyLinkedList() {
	}

	/**
	 * Get the value of the index-th node in the linked list. If the index is
	 * invalid, return -1.
	 */
	public int get(int index) {
		int cur = 0;
		MyLinkedList node = this;
		while (cur < index) {
			node = node.next;
			cur++;
		}
		System.out.println(node.val);
		return node.val;
	}

	/**
	 * Add a node of value val before the first element of the linked list. After
	 * the insertion, the new node will be the first node of the linked list.
	 */
	public void addAtHead(int val) {
		if (this.val != null) {
			MyLinkedList first = new MyLinkedList();
			first.next = this;
			first.val = val;
		} else {
			this.val = val;
		}
	}

	/** Append a node of value val to the last element of the linked list. */
	public void addAtTail(int val) {
		MyLinkedList node = this;
		while (node.next != null) {
			node = node.next;
		}
		node.next = new MyLinkedList();
		node.next.val = val;
	}

	/**
	 * Add a node of value val before the index-th node in the linked list. If index
	 * equals to the length of linked list, the node will be appended to the end of
	 * linked list. If index is greater than the length, the node will not be
	 * inserted.
	 */
	public void addAtIndex(int index, int val) {

		int cur = 0;
		MyLinkedList node = this;
		while (node.next != null) {
			node = node.next;
			cur++;
		}
		if (index > cur) {
			return;
		} else {
			cur = 0;
			node = this;
			while (cur < index - 1) {
				node = node.next;
				cur++;
			}
			MyLinkedList preNode=node;
			MyLinkedList currNode=node.next;
			MyLinkedList newNode = new MyLinkedList();
			newNode.next=currNode;
			newNode.val=val;
			preNode.next=newNode;
		}

	}

	/** Delete the index-th node in the linked list, if the index is valid. */
	public void deleteAtIndex(int index) {
		int cur = 0;
		MyLinkedList node = this;
		while (cur < index - 1) {
			node = node.next;
			cur++;
		}
		MyLinkedList preNode = node;
		MyLinkedList currNode = preNode.next;
		MyLinkedList laterNode = currNode.next;
		preNode.next = laterNode;
	}

}