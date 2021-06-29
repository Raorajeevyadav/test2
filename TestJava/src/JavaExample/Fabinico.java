package JavaExample;

import java.util.Scanner;

public class Fabinico {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=1;
		
		System.out.println("Enter the no");
		Scanner scan= new Scanner(System.in);
		
		
		int num= scan.nextInt();
		
		//if(num==1)
		System.out.print(n1 +" "+n2);
			
		
				
		for(int i=2; i<num; i++){
               
			int n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
			
			
			
			
			
		}
		
		

	}

}
