package Abstraction;

public class Suzuki extends Spresso {
	@Override
	void start() {
		System.out.println(" Start with  Kick");
	}

	public static void main(String[] args) {
		
		Suzuki A=new Suzuki();
		A.start();
		Maruti B= new Maruti();
		B.start();
		
	}

}
