package westview.ds;



public class SinglyLinkedList {

    /* add intance vars: call them head and size */
    private Node head;
    private int size;
	
	/* comments to be completed */ 
	public SinglyLinkedList() {
		/* to be completed */
		head = null;
		size = 0;

	}
	
	public Node getHead() {
		return head;
	}
	
	public void setHead(Node head) {
		this.head = head;
	}
	
	/* comments to be completed */
	public int size() {
		return size;
	}
	
	/* comments to be completed */
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
	
	/* comments to be completed */
	public Node remove(int n) {
		if (head.getData() == null || n > size) {
			return null;
		}
		

        //calls private remove helper method which
        //removes the node at index n recursively
		size--;
		System.out.println("{" + size + "}");
		return remove(head, n, n);

	}
	
	private Node remove(Node curr, int i, int n){
		if (n == 0) {
				Node temp = head;
				shift(head);
				//head = head.getNext();
				
				
			   return temp;
			   
		   }
		   else {
			   if (i == 0) {
				   Node temp = new Node(curr.getData());
				   
				   shift(curr);
				   
				   return temp;
			   }
			   else {
				   
				   return remove(curr.getNext(), i -= 1, n);
			   }
		   }
	}
	
	private void shift(Node curr) {
		if (curr.getNext() == null) {
			curr.setData(null);
			return;
		}
		
//		if (curr.getNext().getNext() == null) {
//			curr.setData(curr.getNext().getData());
//			shift(curr.getNext());
//		}
		else {
		   curr.setData(curr.getNext().getData());
		   System.out.println(curr.getNext().getData());
		   shift(curr.getNext());
//		   if (curr.getNext().getNext() != null) {
//			   curr.setNext(curr.getNext().getNext());
//			   System.out.println(curr.getData());
//		   }
		}
		
	}
	
	public void add(Node n) {
		/* to be completed */
        //calls private add helper method which
        //adds the node at the end recursively
		add(head, n);
		size++;
		System.out.println("size is " + size);

	}
	
	private void add(Node curr, Node add){
		if (size == 0) {
	    	head = add;
	    }
		else {
			if (curr.getNext() == null) {
				curr.setNext(add);
				return;
			}
			else {
				add(curr.getNext(), add);
			}
		}
		
	    
	}
	
	public void add(int index, Node n) {
		if (head == null && index == 0) {
			head = n;
			size ++;
			return;
			
		}
		
		if (index == 0) {
			Node temp = head;
			head = n;
			n.setNext(temp);
			size++;
			return;
		}
		
		if (size == index) {
			add(n);
			return;
		}
		
		if (index > size){
	        return;
	    }
		

		size++;
		add(index, n, head);
	    
	}

	private void add(int index, Node n, Node curr) {
		//System.out.println("r");
		if (index <= 1){
			Node temp = curr.getNext();
	    	curr.setNext(n);
	    	curr.getNext().setNext(temp);
	    	return;
	    }
		System.out.println("p");
		add(index -1, n, curr.getNext());
		
		
	}
	

	
	

	/* comments to be completed */
	public Node get(int index){
		if (head.getData() == null || index > size) {
			System.out.println("out of bounds");
			return null;
		}
	    //calls private get helper method which
        //gets the node at the index recursively
	    return get(head, index, index);
	}
	
	
	private Node get(Node curr, int i, int index){
	   
	   if (index == 0) {
		   return head;
	   }
	   else {
		   if (i == 0) {
			   return curr;
		   }
		   else {
			   return get(curr.getNext(), i -= 1, index);
		   }
	   }
	   
	}
	
	
	
	
	 
}
