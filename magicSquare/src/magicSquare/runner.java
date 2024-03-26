package magicSquare;
import java.util.Arrays;

public class runner {

    public static void computeMagicSquare(int[][] data){

        // fill the zero-filled data 2d array with consecutive numbers
        // based on the given magic square algorithm
        int x = data.length/2;
        int y = 0;
        data[y][x] = 1;
        for (int i = 2; i <= data.length*data.length; i ++){
            if ((i-1)%data.length == 0){
                y ++;
            }
            else{
                x++;
                y--;
            
                if (y<0){
                    y = data.length-1;
                }
                if (x==data.length){
                    x = 0;
                }
            }    
            data[y][x]=i;
        }

    }
    public static void main(String args[]) {
    	int[][] s = new int[3][3];
        computeMagicSquare(s);
        for (int i = 0; i < s.length; i ++) {
        	System.out.println();
        	for (int j = 0; j < s.length; j ++) {
        		System.out.print(s[i][j]+"  ");
        	}
        }
        
    }
    
}
