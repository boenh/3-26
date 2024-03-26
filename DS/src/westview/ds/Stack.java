package westview.ds;

import java.util.ArrayList;

public class Stack<T> {
	
	//implement storing the data using a 1D array
	private ArrayList<T> data;
	
	//add a constructor
	
	public Stack() {
		//instantiate the data list
		data = new ArrayList<T>();
	}
	
	//add a getter called pop
	//that will remove to the top of the Stack
	//return null if empty
	public T pop() {
		
		//what to return?
		//return the top of the Stack <remove the element)
		if (data.size()==0) {
			return null;
		}
		return data.remove(data.size()-1);
	}
	
	//preview what is at the top of the Stack
	public T peek() {
		//return the value at the top of the Stack
		//don't remove it
		if (data.size()==0) {
			return null;
		}
		return data.get(data.size()-1);
	}
	
	//add a size method that returns the #of els in the Stack
	public int size() {
		return data.size();
	}
	
	// add a setter called push
	//that will push to the top of the Stack
	public void push (T element) {
		
		//add the element to the top of the Stack
		data.add(element);
	}

}
