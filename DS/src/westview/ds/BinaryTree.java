package westview.ds;

import java.util.ArrayList;

public class BinaryTree {
	
	//"Top" of the tree
	Node head;
	int size;
	
	
	public BinaryTree() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	/**
	 * Add node to the tree!
	 * keeps the tree in a sorted fashion
	 * every node to the right of a node is great-than-or-equal-to that node
	 * every node to the left of a node is less-than that node
	 * @param arg
	 */
	public void add(Node n) {
        /* to be completed */
		if (head == null) {
			head = n;
			size++;
			return;
		}
		size++;
		add(n, head);
		
	}
	
	
	private void add(Node n, Node curr) {

		if ((int)n.getData() <= (int)curr.getData()) {
			if (curr.getPrev()==null) {
				curr.setPrev(n);
				return;
			}
			add(n, curr.getPrev());
			
		}
		
		if ((int)n.getData() >= (int)curr.getData()) {
			if (curr.getNext()==null) {
				curr.setNext(n);
				return;
			}
			add(n, curr.getNext());
		}
		
	}
	
	
	
	public void print() {
		//print all the elements - no specifics on how for the time being
		//for testing purposes
		
		  /* to be completed */
		print(head);
		
	}
	
	private void print(Node curr) {
		if (curr == null) {
			return;
		}
		System.out.print(curr.getData() + " ");
		if (curr.getPrev() != null) {
			
			print(curr.getPrev());
		}
		if (curr.getNext() != null) {
			
			print(curr.getNext());
		}
		
		
	}
	
	
	public String bfs() {
		// return a string representation of the nodes
		// in a breath-first-search order
		  /* to be completed */
		if (head == null) {
			return null;
		}
		
		

		return  bfs(head);
	}
	
	
	private String bfs(Node n) {
		String s = "";
		s+=n.getData() + " ";
		ArrayList<Node> currs = new ArrayList<Node>();
		currs.add(n);
		ArrayList<Node> newList = new ArrayList<Node>();
		while (currs.size() != 0) {
			for (int i = 0; i < currs.size(); i ++) {
				if (currs.get(i).getPrev() != null) {
					s+= currs.get(i).getPrev().getData() + " ";
					newList.add(currs.get(i).getPrev());
				}
				if (currs.get(i).getNext() != null) {
					s+= currs.get(i).getNext().getData() + " ";
					newList.add(currs.get(i).getNext());
				}
			}
			currs = newList;
			newList = new ArrayList<Node>();
			
		}
		return s;
	}
	
	private static void addToList(ArrayList<Node> newList, ArrayList<Node> curr){
		if (curr.size()==0) {
			return;
		}
		newList.add(0, curr.get(curr.size()-1).getPrev());
		addToList(newList, curr);
		
	}
	
	
	//pre-order depth-first-search traversal
	public String dfs() {
	      /* to be completed */
		ArrayList<String> dfss = new ArrayList<String>();
		dfs(head, dfss);
		
		String ss = "";
		for (int i = 0; i < dfss.size(); i ++) {
			ss+= dfss.get(i) + " ";
		}
		return ss;
	}
	
	private void dfs(Node curr, ArrayList<String> dfs) {
		if (curr == null) {
			return;
		}
		dfs.add(curr.getData() + "");
		
		if (curr.getPrev() != null) {
			
			dfs(curr.getPrev(), dfs);
		}
		if (curr.getNext() != null) {
			
			dfs(curr.getNext(), dfs);
		}
		
		
	}
		
}
