package dataStructures;

import java.util.Arrays;

public class Queue<T> {
	
	private Object[] array;
	private int indexOfLast;
	private int capacity;
	
	public Queue(int capacity) {
		this.array = new Object[capacity];
		this.indexOfLast = -1;
		this.capacity = capacity;
	}
	
	public void enqueue(T element) {
		if (!isFull()) {
			array[++indexOfLast] = element;
			System.out.println(element + " was added");
		}
		
		else if (isFull())
			System.out.println("Queue is full!");
	}
	
	public T dequeue() {
		T element = null;
		
		if(!isEmpty()) {
			element = (T) array[0];
			
			for (int i = 1; i < array.length; i++) 
				array[i-1] = array[i];
			this.indexOfLast--;
			array[capacity-1] = null;
			
		}
		
		else if (isEmpty())
			System.out.println("Queue is empty!");
		
		return element;
		
	}
	
	private boolean isFull() {
		return indexOfLast + 1 == capacity;
	}
	
	private boolean isEmpty() {
		return indexOfLast + 1 == 0;
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
