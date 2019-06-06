package dataStructures;

public class LinkedList<T> {
	
	private class Node {
		private T data;
		private Node next;
		
		private Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
//	private int size;
	
	
	public LinkedList() {
		head = null;
//		this.size = 0;
		
	}
	
	public void add(T data) {
		
		if (head == null)
			head = new Node(data);
		
		else {
			Node tempNode = head;
			while(tempNode.next != null)
				tempNode = tempNode.next;
			tempNode.next = new Node(data);
		}
		
		System.out.println(data + " was added");
	}
	
	public void removeLast() {
		Node tempNode = head;
		
		while(tempNode.next.next != null) {
			tempNode = tempNode.next;
		}
		
		tempNode.next = null;
		
	}
	
	public boolean remove(T element) {
		Node tempNode = head;
		boolean flag = false;
		
		while(tempNode.next != null && tempNode.next.data != element)
			tempNode = tempNode.next;
		
//		if (tempNode.next.data == element)
//			flag = true;
		
		if(tempNode.next != null && tempNode.next.data == element) {
			tempNode.next = tempNode.next.next;
			flag = true;
		}
		
		return flag;
	}

	@Override
	public String toString() {
		Node tempNode = head;
		String str = "[ ";
		
		while(tempNode != null) {
			str = str.concat(tempNode.data + " ");
			tempNode = tempNode.next;
		}
		str = str.concat("]");
		return str;
	}
	
	
	
//	public void display() {
//		Node tempNode = head;
//		
//		while(tempNode != null) {
//			System.out.println(tempNode.data);
//			tempNode = tempNode.next;
//		}
//	}

}
