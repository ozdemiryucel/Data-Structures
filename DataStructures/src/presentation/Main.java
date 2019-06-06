package presentation;

import dataStructures.BinarySearchTree;
import dataStructures.LinkedList;
import dataStructures.Queue;
import dataStructures.Stack;

public class Main {

	public static void main(String[] args) {
		
		runStack();
		runQueue();
		runLinkedList();
		runBinarySearchTree();
		
	}


	private static void runStack() {
		System.out.println("-------------------------------------\nStack:");
		
		Stack<Integer> stack = new Stack<>(10);
		
		stack.push(4);
		stack.push(6);
		stack.push(8);
		stack.push(10);
		stack.push(16);
		
		System.out.println(stack.pop() + " was popped!!!");
		System.out.println(stack.pop() + " was popped!!!");
		
		System.out.println(stack.toString());
		
	}
	
	private static void runQueue() {
		System.out.println("-------------------------------------\nQueue:");
		
		Queue<Integer> queue = new Queue<>(10);
		
		queue.enqueue(4);
		queue.enqueue(6);
		queue.enqueue(8);
		queue.enqueue(10);
		queue.enqueue(16);
		
		System.out.println(queue.dequeue() + " was dequeued!!!");
		System.out.println(queue.dequeue() + " was dequeued!!!");

		System.out.println(queue.toString());
	}
	
	private static void runLinkedList() {
		
		System.out.println("-------------------------------------\nLinked List:");
		
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		linkedList.add(4);
		linkedList.add(6);
		linkedList.add(8);
		linkedList.add(10);
		linkedList.add(16);
		
		System.out.println(linkedList.remove(8));
		System.out.println(linkedList.remove(30));

		System.out.println(linkedList.toString());
	}

	private static void runBinarySearchTree() {
		System.out.println("-------------------------------------\nBinary Search Tree:");
		
		BinarySearchTree<Integer> tree = new BinarySearchTree<>();
		tree.insert(50); 
		tree.insert(30); 
		tree.insert(20); 
		tree.insert(40); 
		tree.insert(70); 
		tree.insert(60); 
		tree.insert(80); 
		
		tree.delete(50);
		tree.delete(80);

		// print inorder traversal of the BST 
		tree.printInOrder();
	}

}
