package Polymorphism;

public class Method_Overloading {
	public void show() {
		System.out.println("1");
	}
	public void show(int a) {
		System.out.println("2");
		}
		public void show(char a) {
		System.out.println("3");
		}
		public void show(int a ,char b) {
		System.out.println("4");
		}
	public static void main(String[] args) {
		Method_Overloading A = new Method_Overloading();
		A.show();//1
		A.show(5);//2
		A.show('p');//3
		A.show(6, 'b');//4
		}


	}


