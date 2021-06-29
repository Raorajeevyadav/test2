package JavaExample;

import java.util.Scanner;

class person{
	private int age;
	
	public int getAge() {
		return age;
		
	}
	public void setAge(int age) {
		this.age=age;
		//System.out.println(age);
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		person p= new person();
		p.setAge(27);
		
		System.out.println("My age is " + p.getAge());
		
	}

	

}
