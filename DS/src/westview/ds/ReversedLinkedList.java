package westview.ds;

public class ReversedLinkedList {
	
	
    public void reverse(SinglyLinkedList list){
    	Node current = list.get(0);
    	Node next = current.getNext();
    	Node prev = null;
    	//System.out.println(current.getData() + "    " + next.getData() + "    " + prev + "     ");
    	while (current != null) {
    		next = current.getNext();
    		current.setNext(prev);
    		prev = current;
    		current = next;
        	//System.out.println(current.getData() + "    " + next.getData() + "    " + prev.getData() + "     ");

    	}
    	list.setHead(prev);
    	//System.out.println(list.getHead().getData());
    }
    
    

}
