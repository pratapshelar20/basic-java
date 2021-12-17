package InterfaceDemo;

public class Test1 implements I1, I2 {
//	@Override
//	public void display() {
//	 System.out.println("1");
//	}
//	@Override
//	public void show() {
//	 System.out.println("2");
//	}
//
//	public static void main(String[] args) {
//		
//		Test1 t1 =new Test1();
//		t1.show();
//		t1.display();
//	}
@Override
public void display () {
	System.out.println("23");
}
@Override
public void show () {
	System.out.println("76");
	}
	public static void main(String[] args) {
	//public static void main (String[] args) {
		Test1 a1=new Test1();
		a1.display();
		a1.show();
	}}

