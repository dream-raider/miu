package lesson9.prg3;

import java.util.Arrays;

/**
 * @author Erika
 *
 */

public class ArrayQueueImpl {
	private int[] arr = new int[10];
	private int size = 0;
	private int front = -1;
	private int rear = 0;

	public void enqueue(int elem) {
		// resize if the rear(last index number) is equal to the array length
		if (rear == arr.length) {
			resize();
		}
		// enqueue the element to the end
		arr[rear] = elem;
		// increment the value
		rear++;
		front++;
		size++;

	}

	public int size() {
		return size;
	}

	public void resize() {
		// resizing the new array double the size of original array and copying the data
		int[] tempArr = new int[arr.length * 2];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		arr = tempArr;

	}

	public void dequeue() {
		if (isEmpty())
			throw new IllegalStateException("Cannot peek because Queue is empty!");

		if (front > -1) {
			// reduce the size of array as one element has been removed
			int[] tempArr = new int[arr.length - 1];
			System.arraycopy(arr, 0, tempArr, 0, arr.length - 1);
			arr = tempArr;
			front--;
			rear--;
		}

	}

	public int peek() {
		if (isEmpty())
			throw new IllegalStateException("Cannot peek because Queue is empty!");
		if (front != -1)
			return arr[0];
		else
			return front;

	}

	public boolean isEmpty() {
		if (front <= -1) {
			return true;
		} else
			return false;
	}

	@Override
	public String toString() {
		return Arrays.toString(arr);
	}

	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		for (int i = 0; i < 15; i++)
			q.enqueue(i);
		System.out.println("After enqueue: " + q.toString());
		for (int i = 0; i < 14; i++)
			q.dequeue();
		System.out.println("After dequeue" + q.toString());
		System.out.println("Size: " + q.size());
		System.out.println("Peek: " + q.peek());
	}
}
