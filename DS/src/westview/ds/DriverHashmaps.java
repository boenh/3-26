package westview.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DriverHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m = new HashMap<String, String>();
		 //adding entries to oyr map ("dictionary")
		m.put("nice", "mean");
		m.put("motivated", "lazy");
		m.put("rich", "poor");
		
		//query the map o a non-existing key
		System.out.println(m.get("study"));
		
		//query the map for something that exists
		System.out.println(m.get("motivated"));
		
		System.out.println(m.size());
		
		HashMap m2 = new HashMap<String, ArrayList<String>>();
		
		//list of favorite food
		ArrayList<String> food = new ArrayList<String>();
		food.add("Pasta");
		food.add("Coffee");
		food.add("Boba");
		m2.put("Mr. David", food);
		
		System.out.println(m2.get("Mr. David"));
			
		
		
		
		try {
			File file = new File("covid417.csv");
			Scanner scanner = new Scanner(file);
			
			HashMap m3 = new HashMap<String, ArrayList<String[]>>();
			while(scanner.hasNext()) {
				String[] city = scanner.nextLine().split(",");
				if (m3.get(city[1]) == null) {
					ArrayList<String[]> list = new ArrayList<String[]>();
					list.add(city);
					m3.put(city[1], list);
					
				}
				else {
					ArrayList<String[]> list = ((ArrayList) m3.get(city[1]));
					list.add(city);
					m3.replace(city[1], list);
				}
				
			}
			scanner.close();
			
			
			while (true) {
				
				
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please enter a state");
				String state = userInput.nextLine();
				ArrayList<String[]> temp = (ArrayList)m3.get(state);
				int confermed = 0;
				for(int j = 0; j < temp.size(); j ++) {
					confermed += Integer.parseInt(temp.get(j)[3]);
				}
				
				
				
				
				
				System.out.println(state + "confirmed total is: " + confermed );
			
			}
			}
		
		catch (FileNotFoundException e) {	
			System.out.println(e);
		}
	}
	
	
	

}
