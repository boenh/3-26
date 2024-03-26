import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FileChooser {
	public static void main(String[] Args) {
		try {
			File file = new File("easyMap1coords.txt");
			Scanner scanner = new Scanner(file);
			
			int row = Integer.parseInt(scanner.next());
			int col = Integer.parseInt(scanner.next());
			int room = Integer.parseInt(scanner.next());
			System.out.println(row);
			System.out.println(col);
			System.out.println(room);
			ArrayDeque<String[]> queue = new ArrayDeque<String[]>();
			
			while (scanner.hasNext()) {
				
				String[] bob = new String[4];
				bob[0] = scanner.next();
				bob[1]= scanner.next();
				bob[2] = scanner.next();
				bob[3] = scanner.next();

				queue.add(bob);
				bob = new String[4];
				
				
			
			}
//			ArrayDeque<String[]> temp = queue;
//			int sizee = queue.size();
//			for (int ii = 0; ii < sizee; ii ++) {
//				System.out.println("This is part of queue" + Arrays.toString(temp.remove()));
//			}
			
			
			
			QueueSolve tom = new QueueSolve();
			ArrayDeque<String[]> list = tom.walkable(queue, col, row, room);
			int s = list.size();
			for (int i = 0; i < s; i ++) {
				System.out.println(Arrays.toString(list.remove()));
			}
			
			
			
			
		}
		catch (FileNotFoundException e) {	
			
		}
	}
}