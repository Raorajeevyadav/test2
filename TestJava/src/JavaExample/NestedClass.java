package JavaExample;

class CPU {
	double price;

	class Processor {
		double cache;
		String manufacture;

		double getCache(double x) {
			return x;
		}
	}

	protected class Ram {
		double memory;
		String manufacture;

		double getClockSpeed(double x) {
			return x;
		}
	}

}

public class NestedClass {
	public static void main(String[] agrs) {

		CPU cpu = new CPU();

		CPU.Processor processor = cpu.new Processor();
		CPU.Ram ram = cpu.new Ram();

		System.out.println("System cache: " + processor.getCache(5));
		System.out.println("System Clock Speed: " + ram.getClockSpeed(3));

	}

}
