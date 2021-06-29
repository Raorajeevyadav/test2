package JavaExample;


import JavaExample.Animal1.Doge;

class Animal1{
	
public static void A(){
		System.out.println("Method A");
	}

  static class Doge extends Animal1{
	
	public static void A() {
		System.out.println("Method B");
	}
}
	
}

public class Inheritance {

	
	public static void main(String[] args) {
		
		Animal1 a= new Animal1();
		Doge d=  new Doge();
		a.A();
		d.A();
		
		
	}
	
}
