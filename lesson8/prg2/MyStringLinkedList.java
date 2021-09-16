package lesson8.prg2;

public class MyStringLinkedList {
	Node header;
	int size = size();

	MyStringLinkedList() {
		header = new Node(null);
	}

	int size() {
		if (header == null)
			return 0;
		Node temp = header.next;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public void insert(String data, int pos) {
		if (pos == size)
			addLast(data);
		else if (pos == 0) {
			addFirst(data);
		} else {
			// create new node with given data
			Node n = new Node(data);
			// point the current node to the header
			Node current = header;
			// temp node
			Node temp = null;

			// iterate list until it reaches the specified position and set current as the
			// element currently present in that position
			while (pos != 1) {
				current = current.next;
				pos--;
			}
			// temp node to point to the neighbors of current which will be the next node of
			// the new node
			/** head->1->2->current->temp **/
			temp = current.next;
			temp.previous = current;
			/** head->1->2->current->temp **/
			// adding new node between current and temp
			current.next = n;
			temp.previous = n;
			n.previous = current;
			n.next = temp;/** head->1->2->current->newNode->temp **/

		}

	}

	// adds to the front of the list
	public void addFirst(String item) {
		Node n = new Node(item);
		// place new node after header and
		// establish links from new node to
		// surrounding nodes
		n.next = header.next;
		n.previous = header;

		// establish links from surrounding
		// nodes to the new node
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;
	}

	// adds to the end of the list
	public void addLast(String item) {
		Node n = new Node(item);
		// find last node
		Node last = header;
		while (last.next != null) {
			last = last.next;
		}
		// now last.next == null
		last.next = n;
		n.previous = last;
	}

	// removes node in last position
	public void removeLast() {
		// if list is empty, return
		if (header.next == null)
			return;

		Node current = header;
		// traverse the list until current.next is
		// null - then remove current
		while (current.next != null) {
			current = current.next;
		}
		// now current.next == null, so remove current
		Node previous = current.previous;
		// previous is not null since current is not header
		previous.next = null;
		current.previous = null;
	}

	// attempts to remove the first Node that contains
	// data; if successful, returns true; otherwise, false.
	public boolean remove(String data) {
		// data not present in the list
		if (!search(data))
			return false;
		// empty list
		if (header.next == null)
			return false;

		Node current = header;
		// traverser the list until current.next.value = data
		while (current.next.value != data) {
			// setting data into current
			current = current.next;
		}

		current = current.next;

		// the data to be removed is last element
		if (current.next == null) {
			removeLast();
			return true;
		}
		Node prevNode = current.previous;
		Node nextNode = current.next;
		prevNode.next = nextNode;
		nextNode.previous = prevNode;

		return true;
	}

	// determines whether the input string is in the list
	public boolean search(String s) {
		Node next = header.next;
		while (next != null && !next.value.equals(s)) {
			next = next.next;
		}
		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}
	}

	// TODO recursive search-> StackOverflow error occurs/ only works for searching
	// first elem
	boolean recurSearch(String data) {
		Node next = header.next;
		while (next != null && !next.value.equals(data)) {
			recurSearch(next.next.value);
		}

		// either next == null or next.value is s
		if (next == null)
			return false;
		else {// next.value.equals(s)
			return true;
		}

	}

	/******* sorting methods ********/
	public void minSort() {
		if (header.next == null)
			return;
		Node next = header.next;
		while (next != null) {
			Node minNode = minNode(next);
			swap(next, minNode);
			next = next.next;
		}
	}

	void swap(Node n1, Node n2) {
		String temp = n1.value;
		n1.value = n2.value;
		n2.value = temp;
	}

	// find minimum of arr between the indices bottom and top
	public Node minNode(Node n) {
		Node minNode = n;
		while (n.next != null) {
			if (n.value.compareTo(n.next.value) > 0) {
				minNode = n.next;
			}
			n = n.next;
		}
		return minNode;

	}

	/********* end sorting methods ********/

	public String toString() {
		var sb = new StringBuffer();
		Node next = header.next;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		var result = sb.toString().trim();
		if (result.length() == 0)
			return "<empty list>";
		if (result.charAt(result.length() - 1) == ',') {
			return result.substring(0, result.length() - 1);
		}
		return result;
	}

	class Node {
		String value;
		Node next;
		Node previous;

		Node(String value) {
			this.value = value;
		}

		public String toString() {
			return value == null ? "null" : value;
		}
	}

	public static void main(String[] args) {
		var list = new MyStringLinkedList();
		list.addLast("Rich");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Bob");
		list.addFirst("Harry");
		list.addFirst("Steve");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		System.out.println(list.search("Harry"));
		System.out.println(list.search("Bob"));
		list.addLast("Tom");
		System.out.println(list);
		System.out.println("\n===INSERT ERIKA IN POS 2 ===");
		list.insert("Erika", 2);
		System.out.println(list);
//		System.out.println("Does Erika exist by doing recursive search? " + list.recurSearch("Erika"));
		list.remove("Erika");
		System.out.println("\n===REMOVING ERIKA FROM POS 2 ===");
		System.out.println(list);

		list.minSort();
		System.out.println("\n=====Sorted List=====");
		System.out.println(list);

	}
}
