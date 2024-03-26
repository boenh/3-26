package westview.ds;

public class DoublyLinkedList {
	private Node head;
	private int size;
	private Node tail;
	
	public DoublyLinkedList() {
		
		head = null;
		tail = null;
		size = 0;

	}
	
	public int size() {
		return size;
	}
	
	public String toString() {
		
		return "[" + toString(head, size) + "]";

	    
	}
	
	private String toString(Node n, int i) {
		if (i <= 1) {
		    
			return n.getData()+ "";
			
		}
		else{
			return n.getData() + ", " + toString(n.getNext(), i-=1);
		}
	}
	
	public void add(int index, Node n) {
		if (index > size) {
			return;
		}
		if (index ==0 && head == null) {
			head = n;
			tail = n;
			size++;
			
			System.out.println("head is " + head.getData());
			System.out.println("tail is " + tail.getData());
			return;
		}
		if (index == 0) {
			Node temp = tail;
			temp.setPrev(head);
			tail.setNext(tail);
			shiftRight(size, temp);
			head = n;
			tail = temp;
			size++;
			return;
		}
		if (index == size) {
			add(head, n);
			return;
		}
		
		add(index, index, head, n);
		
	}
	
	public void add(Node n) {
		Node temp = head;
		size++;
		if (temp==null) {
			head = n;
			tail = n;
			return;
		}
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(n);
		temp.getNext().setPrev(temp);
		
	}
	
	private void add(int index, int i, Node curr, Node n) {
		if (i <= 0) {
			Node temp = tail;
			System.out.println("temp is " + temp.getData());
			tail.setNext(tail);
			
			shiftRight((size-index), temp);
			
			curr = n;
			System.out.println("curr");
			size++;
			return;
			
		}
		
		add(index, i-1, curr.getNext(), n);
		System.out.println("shift");
		
	}
	
	
	
	private void shiftRight(int index, Node curr) {
		if (index <= 0) {
			System.out.println("break");
			return;
		}
		System.out.println("wee");
		curr = curr.getPrev();
		shiftRight(index-1, curr.getPrev());
		System.out.println(index);
		
	}
	
	public void shift(int index, Node curr) {
		
		
	}
	
	public void remove(int index) {
		
	}
	
	private void remove(int index, Node curr) {
		if (index <= 0) {
			
		}
		remove(index - 1, curr.getNext());
	}
	
	public Node get(int index) {
		if (head == null) {
			return null;
		}
		return get(index, head);
	}
	
	private Node get(int index, Node curr) {
		if (index == 0) {
			return curr;
		}
		return get(index - 1, curr.getNext());
	}

}
