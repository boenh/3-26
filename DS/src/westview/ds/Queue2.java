package westview.ds;

public class Queue2<T>{

    /* to be completed */
    //instance variables
    private Stack<T> data1;
    private Stack<T> data2;
    /* to be completed */
    //constructor
    public Queue2(){
        data1 = new Stack<T>();
        data2 = new Stack<T>();
    }

    //remove and return the element at the beginning of the list
    public T dequeue(){
        int size = data1.size();
        if (size == 0) {
    		return null;
    	}
        for (int i = 0; i < size; i ++){
            data2.push(data1.pop());
        }
        T b = data2.pop();
        for (int j = 0; j < size-1; j ++){
            data1.push(data2.pop());
        }
        return b;
    }


    //add element at the end of the list
    public void enqueue(T el){
      /* to be completed */
      data1.push(el);

    }

    //return a String representation of the list
    //formatted as [el1, el2, el3, ..., elN]
    public String toString(){
        String list = "";
        int size = data1.size();
        for (int i = 0; i < size; i ++) {
        	data2.push(data1.pop());
        }
        for (int j =0; j < size; j ++){
            list += data2.peek();
            if (j != size-1){
                list += ", ";
            }
            data1.push(data2.pop());
        }    


        return "[" + list + "]" ; 
    }


    /* return the # of elements in the queue */
    public int size(){
      return data1.size();
    }
    
    /* return true if the queue is empty, false otherwise */
    public boolean empty(){
        
        return data1.size() == 0;
    }
    

}
