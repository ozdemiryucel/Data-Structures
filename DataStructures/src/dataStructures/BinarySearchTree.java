package dataStructures;

public class BinarySearchTree<T extends Comparable<T>> { 

	private class Node { 
		private T data; 
		private Node left; 
		private Node right; 

		public Node(T data) { 
			this.data = data; 
			left = null;
			right = null; 
		} 
	} 

	private Node root;

	public BinarySearchTree() { 
		this.root = null; 
	} 

	public void insert(T data) {
		this.insertInner(this.root, data); 
	} 
	
	private void insertInner(Node node, T data) {

		if (this.root == null) {
			this.root = new Node(data); 
		} 

		else if (data.compareTo(node.data) < 0) { 
			if (node.left == null)
				node.left = new Node(data);
			else
				insertInner(node.left, data); 
		}
		
		else if (data.compareTo(node.data) > 0) {
			if (node.right == null)
				node.right = new Node(data);
			else
				insertInner(node.right, data);
		}
		
	}
	
	public void delete(T data) {
		this.deleteInner(this.root, data);
	}
	
	private Node deleteInner(Node node, T data) {
				
		if (node == null)
			return node;
		
		if (data.compareTo(node.data) < 0) 
			node.left = deleteInner(node.left, data); 
		
        else if (data.compareTo(node.data) > 0) 
            node.right = deleteInner(node.right, data); 
		
        else if (data.compareTo(node.data) == 0) { 
        	if (node.left == null && node.right == null)
        		return null;
        	
        	else if (node.left == null)
                return node.right; 
        	
            else if (node.right == null)
                return node.left; 
  
            node.data = getMinValueOf(node.right); 
  
            node.right = deleteInner(node.right, node.data); 
        } 
		
		return node;
				
	}
	
	private T getMinValueOf(Node node) {
		
		if (node == null)
			return null;
		
        T min = node.data; 
        
        while (node.left != null) { 
            min = node.left.data; 
            node = node.left; 
        } 
        
        return min; 
    } 

	public void printInOrder() { 
		this.printInOrder(this.root); 
	} 

	private void printInOrder(Node node) { 
		if (node != null) { 
			printInOrder(node.left); 
			System.out.println(node.data); 
			printInOrder(node.right); 
		} 
	} 

} 

