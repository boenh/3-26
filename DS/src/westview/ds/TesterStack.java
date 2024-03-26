package westview.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesterStack {

	@Test
	void test() {
//		Stack<Integer> myStack = new Stack<Integer>();
//		
//		//an empty stack should return a size 0
//		assert(myStack.size()==0); // nothing added
//		
//		//can we try to pop?
//		assert(myStack.pop()==null); //empty
//		
//		//write an assertion about the peek method
//		//that should be true when the Stack is empty
//		assert(myStack.peek()==null);//empty
//		//push to the Stack twice
//		//make an assertion about what should be true
//		myStack.push(7);
//		myStack.push(11);
//		assert(myStack.size()==2);
//		assert(myStack.peek()==11);
//		//destructive testing
//		assert(myStack.pop()==11);
//		
//		//check that size changed ant that the new top is what is expected
//		assert(myStack.peek()==7);
//		
//		/////////////////////////////////////////////
//		/////////////////////////////////////////////////\
//		
//		
//		Queue<Integer> myQueue = new Queue<Integer>();
//		//an empty stack should return a size 0
//		assert(myQueue.size()==0); // nothing added
//		
//		//can we try to pop?
//		assert(myQueue.pop()==null); //empty
//		
//		//write an assertion about the peek method
//		//that should be true when the Stack is empty
//		assert(myQueue.peek()==null);//empty
//		//push to the Stack twice
//		//make an assertion about what should be true
//		myQueue.push(7);
//		myQueue.push(11);
//		assert(myQueue.size()==2);
//		assert(myQueue.peek()==7);
//		//destructive testing
//		assert(myQueue.pop()==7);
//		
//		//check that size changed ant that the new top is what is expected
//		assert(myQueue.peek()==11);
//		
//		Queue2<Integer> myQueue2 = new Queue2<Integer>();
//		assert (myQueue2.size() == 0);
//		myQueue2.enqueue(7);
//		myQueue2.enqueue(11);
//		assert(myQueue2.size()==2);
//		
//		System.out.println(myQueue2.toString());
//		assert(myQueue2.toString().equals("[7, 11]"));
////		
////		assert(myQueue2.dequeue()==7);
//		myQueue2.enqueue(1);
//		myQueue2.enqueue(2);
//		myQueue2.enqueue(3);
//		System.out.println(myQueue2.toString());
//		System.out.println(myQueue2.toString());
//		
//		SinglyLinkedList list = new SinglyLinkedList();
//		list.add(new Node(1));
//		list.add(new Node(2));
//		list.add(new Node(3));
//		list.add(new Node(4));
//		list.add(new Node(5));
//		list.add(new Node(6));
//		
//		System.out.println(list.toString());
//////		System.out.println(list.toString());
////		System.out.println("head is"+list.head.getData());
////
////		list.remove(0);
////		System.out.println("head is"+list.head.getData());
////
////		
//////		System.out.println("{" + a);
////		
////		list.add(new Node(list.get(0).getData()));
//////		list.shiftRight(0, list.size(), 0, list.get(0));
////		System.out.println(list.size());
////		System.out.println(list.toString());
////		System.out.println("head is"+list.head.getData()+list.size());
////		System.out.println("end is"+list.get(6).getData());
////
////		System.out.println(list.get(4).getNext().getData());
//		
//		ReversedLinkedList b = new ReversedLinkedList();
//		b.reverse(list);
//		System.out.println(list.toString());
		
//		DoublyLinkedList list = new DoublyLinkedList();
////		list.add(0, new Node(0));
////		list.add(1, new Node(0));
//		list.add(new Node(0));
//		list.add(new Node(1));
//		list.add(new Node(2));
//		System.out.println(list.toString());
//		
//		System.out.println(list.get(2).getPrev().getData());
//		
//		System.out.println("size is" + list.size());
//		
//		System.out.println(list.toString());
//		list.add(0, new Node(1));
//		
//		System.out.println(list.toString());
//		
//		BinaryTree tree = new BinaryTree();
////		tree.add(new Node(0));
////		tree.add(new Node(10));
////		tree.add(new Node(-10));
////		tree.add(new Node(-15));
////		tree.add(new Node(-5));
////		tree.add(new Node(5));
////		tree.add(new Node(15));
////		tree.add(new Node(-17));
////		tree.add(new Node(-13));
////		tree.add(new Node(13));
////		tree.add(new Node(17));
//		tree.add(new Node(10));
//		tree.add(new Node(7));
//		tree.add(new Node(5));
//		tree.add(new Node(8));
//		tree.add(new Node(11));
//		
//		System.out.println(tree.dfs());
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.add(0, new Node(3));
		list.add(0, new Node(7));
		list.add(1, new Node(33));
		System.out.println(list.toString());

		

		
	}

}
