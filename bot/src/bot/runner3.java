package bot;

public class runner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mystery("Bo-En"));
		

	}
	public static String mystery( String val) {
		if (val.length() <= 1) return val;
		else
			return mystery(val.substring(1))+val.substring(0,1) + 
					val.substring(1);
	}

}
