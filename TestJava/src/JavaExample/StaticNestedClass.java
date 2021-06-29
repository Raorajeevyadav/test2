package JavaExample;

class Animal {

	public void eat() {
		System.out.println("I am eating");
	}

	class Snake {
		void display() {
			System.out.println("I am snake");
		}
	}

	static class Dog {
		public void display() {

			System.out.println("I am dog");
		}
	}

}

public class StaticNestedClass {

	public static void main(String[] agrs) {

		Animal an = new Animal();
		Animal.Dog dog1 = new Animal.Dog();
		Animal.Snake sn = an.new Snake();

		dog1.display();
		
		sn.display();
		

	}

}
