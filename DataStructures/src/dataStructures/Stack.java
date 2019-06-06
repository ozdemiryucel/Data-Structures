package dataStructures;

import java.util.Arrays;
import java.util.Iterator;

public class Stack<T> {
	
	private Object[] array;
	private int indexOfTop;
	private int capacity;
	
	public Stack(int capacity) {
		this.array = new Object[capacity];
		this.indexOfTop = -1;
		this.capacity = capacity;
	}
	
	public void push(T element) {
		
		if(!isFull()) {
			this.array[++indexOfTop] = element;
			System.out.println(element + " was pushed");
		}
		else if (isFull()) {
			System.out.println("The stack is full");
			return;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public T pop() {
		T element = null;
		
		if (!isEmpty()) {
			element = (T) this.array[indexOfTop];
			this.array[indexOfTop] = null;
			indexOfTop--;
		}
		
		else if (isEmpty()) 
			System.out.println("The stack is empty");
		
		return element;
	}

	private boolean isFull() {
		return indexOfTop + 1 == capacity;
	}
	
	private boolean isEmpty() {
		return indexOfTop + 1 == 0;
	}
	
	public int size() {
		return indexOfTop + 1;
	}

	@Override
	public String toString() {
		String str = "[ ";
		for (Object o : this.array)
			if (o != null)
				str = str.concat(o.toString() + " ");
		str = str.concat("]\ncapacity=" + capacity);
		
		return str;
	}
	
	

}
