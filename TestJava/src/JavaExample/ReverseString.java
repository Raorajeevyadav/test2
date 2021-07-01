package JavaExample;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {

//Reverse By StringBuffer Method
		String str = "Reverse String Example";
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.out.println("String Buffer Method");
		System.out.println(sb);

		// Reverse By Iterator Using charAt method

		String str1 = "";
		for (int x = str.length() - 1; x >= 0; x--) {

			str1 = str1 + str.charAt(x);

		}
		System.out.println("Reverse By Iterator Using charAt method");
		System.out.println(str1);
		
		// Reverse By Iterator Using toCharArray method
		
		char[] stArray=str.toCharArray();
		String str2="";
		for(int i=stArray.length-1;i>=0;i--) {
			str2=str2+stArray[i];
		}
		System.out.println("Reverse By Iterator Using toCharArray method");
		System.out.println(str2);
		
		// Reverse By Iterator Using Array and Collections
		
		char[] stArray1=str.toCharArray();
		List<Character> a= new ArrayList();
		String string3 = "";
		
		for(char ch:stArray1) {
			a.add(ch);
			
		}
		Collections.reverse(a);
		for(char ch:a) {
			string3=string3+ch;
		}
		System.out.println("example of Array and collections");
		System.out.println(string3);
	}
}
