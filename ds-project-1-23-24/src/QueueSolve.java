import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSolve {
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<String[]> ss = new ArrayDeque<String[]>();


	}
	
	public ArrayDeque<String[]> walkable(ArrayDeque<String[]> input, int width, int height, int room){
		ArrayDeque<String[]> copy = input;
		ArrayDeque<String[]> temp = new ArrayDeque<String[]>();
		ArrayDeque<String[]> walkables = new ArrayDeque<String[]>();
		String[] tt = null;
		
		for (int i = 0; i < copy.size(); i ++) {
			if (get(copy, i)[0].equals("W")) {
				temp.add(get(copy, i));
				System.out.println("Weeee" + Arrays.toString(get(copy, i)));
				walkables.add(get(copy, i));
				tt = get(copy,i);
				
			}
		}
		
		
		for (int beefy = 0; beefy< walkables.size(); beefy ++) {
			String[] tempArr = get(walkables, beefy);
			int x = Integer.parseInt(tempArr[2]);
			int y = Integer.parseInt(tempArr[1]);
			
			String[] northSup = {"@", y-1 + "", x+"", tempArr[3]}; 
			String[] northWalk = {".", y-1+"", x+"", tempArr[3]};
			String[] northSupW = {"W", y-1 + "", x+"", tempArr[3]};
			String[] northSup$ = {"$", y-1 + "", x+"", tempArr[3]};
			if (y-1 >= 0 && isInList(copy, northSup) == -1 
					&& isInList(temp, northWalk) == -1&& !sameArray(northSupW, tt)) {

				walkables.add(northWalk);
				temp.add(northWalk);
				

			}
			
			String[] southSup = {"@", y+1 + "", x+"", tempArr[3]}; 
			String[] southWalk = {".", y+1+"", x+"", tempArr[3]};
			String[] southSupW = {"W", y-1 + "", x+"", tempArr[3]};
			String[] southSup$ = {"$", y-1 + "", x+"", tempArr[3]};
			if (y+1 < height && isInList(copy, southSup) == -1 
					&& isInList(temp, southWalk) == -1 && isInList(copy, southSupW) == -1) {

				walkables.add(southWalk);
				temp.add(southWalk);
				

			}
			
			String[] eastSup = {"@", y + "", x+1+"", tempArr[3]}; 
			String[] eastWalk = {".", y+"", x+1+"", tempArr[3]};
			String[] eastSupW = {"W", y-1 + "", x+"", tempArr[3]};
			String[] eastSup$ = {"$", y-1 + "", x+"", tempArr[3]};
			if (x+1 < width && isInList(copy, eastSup) == -1 
					&& isInList(temp, eastWalk) == -1&& isInList(copy, eastSupW) == -1) {

				walkables.add(eastWalk);
				temp.add(eastWalk);

				
			}
			
			String[] westSup = {"@", y + "", x-1+"", tempArr[3]}; 
			String[] westWalk = {".", y+"", x-1+"", tempArr[3]};
			String[] westSupW = {"W", y-1 + "", x+"", tempArr[3]};
			String[] westSup$ = {"$", y-1 + "", x+"", tempArr[3]};
			
			if (x-1 >=0 && isInList(copy, westSup) == -1 
					&& isInList(temp, westWalk) == -1 && isInList(copy, westSupW) == -1) {
				

				walkables.add(westWalk);
				temp.add(westWalk);
				

				
			}
		}
		for (int ii = 0; ii < temp.size(); ii ++) {
			System.out.println("This is part of temp "+ Arrays.toString(temp.remove()));
		}

		return walkables;
	}
	
	public static String[] remove(ArrayDeque<String[]> list, int index) {
		String[] t = null;
		int s = list.size();
		ArrayDeque<String[]> temp = new ArrayDeque<String[]>();
		for (int i = 0; i < s; i ++) {
			if (i == index) {
				t = list.peek();
				list.remove();
			}
			else {
				String[] a = list.peek();
				list.remove();
				temp.add(a);
				//System.out.println("wee" + a);
			}
		}
		
		for (int j = 0; j < s-1; j ++) {
			String[] b = temp.peek();
			temp.remove();
			list.add(b);
			//System.out.println(b);
		}
		return t;
		
	}
	
	public static String[] get(ArrayDeque<String[]> list, int index) {
		String[] t = null;
		int s = list.size();
		ArrayDeque<String[]> temp = new ArrayDeque<String[]>();
		for (int i = 0; i < s; i ++) {
			if (i == index) {
				t = list.peek();
				
			}
			
			String[] a = list.peek();
			list.remove();
			temp.add(a);
			//System.out.println("wee" + a);
			
		}
		
		for (int j = 0; j < s; j ++) {
			String[] b = temp.peek();
			temp.remove();
			list.add(b);
			//System.out.println(b);
		}
		return t;
		
		
	}
	
	public static int isInList(ArrayDeque<String[]> list, String[] index) {
		int t = -1;
		int s = list.size();
		ArrayDeque<String[]> temp = new ArrayDeque<String[]>();
		for (int i = 0; i < s; i ++) {
			
			
			if (sameArray(index, list.peek())) {
				
				t = i;
				
			}
			
			String[] a = list.peek();
			list.remove();
			temp.add(a);
			//System.out.println("wee" + a);
			
		}
		
		for (int j = 0; j < s; j ++) {
			String[] b = temp.peek();
			temp.remove();
			list.add(b);
			//System.out.println(b);
		}
		System.out.println("index is " +t);
		return t;
		
		
	}

	
	public static boolean sameArray(String[] arr1, String[] arr2) {

		for (int i = 0; i < arr1.length; i ++) {

			if (!arr1[i].equals(arr2[i])) {
				
				return false;
			}
		}


		return true;
	}

}
