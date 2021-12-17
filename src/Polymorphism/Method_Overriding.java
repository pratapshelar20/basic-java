package Polymorphism;

public class Method_Overriding extends Method_Overloading {
	public void show() {
		System.out.println("1");
		}
		public static void main(String[] args) {
			Method_Overloading demo1 = new Method_Overloading();
		demo1.show();//1
		Method_Overriding demo2 = new Method_Overriding();
		demo2.show();//2
		Method_Overriding demo3 = new Method_Overriding();
		demo3.show();//3
		}


}
