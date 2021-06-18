package JavaExample;

import java.util.Arrays;

public class RightSorting {
	
	
	public static int[] shifttoright(int[]a) {
		
		if(a.length==1) {
			
			return a;
		}
		int count=0;
		int newArray[]= new int[a.length];
		for(int number:a) {
			if(number!=0) {
				newArray[count]=number;
				count++;
			}
		}
		return newArray;
	}
		
		public static void main(String [] args) {
			
			int []i= new int[]{1,2,3,4,0,6,8,0,0};
			System.out.println(Arrays.toString(shifttoright(i)));
			
		}
		
		
		
	
	
	
	

}