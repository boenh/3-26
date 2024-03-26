package westview.ds;


public class Node<T> {
//	//A Node has-a next node reference
//	private Node<T> next;
//	//A Node stores data 
//	private T data;
//	
//	//constructor that takes in the data element
//	public Node(T val) {
//		this.data = val;
//	}
//	
//	
//	//getter for the data and next reference
//	//called getNext and getData
//	
//	public Node<T> getNext() {
//		return next;
//	}
//
//	public T getData() {
//		return data;
//	}
//	public void setNext(Node<T> n) {
//		next = n;
//	}
	private T data;
    private Node next;
    private Node prev;
    
    public Node(T t) {
        data = t;
        System.out.println("creating"+data);
    }
    
    public T getData() {
        return data;
    }
    
    public void setData(T t) {
        data = t;
    }

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
