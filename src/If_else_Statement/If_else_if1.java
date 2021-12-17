package If_else_Statement;

import java.util.Scanner;

public class If_else_if1 {

	public static void main(String[] args) {
		//Scanner sc =new Scanner (System.in);
	//	System.out.println("Enter the Number::");
		
		Scanner sc1=new Scanner (System.in);
		System.out.println("execute the no::");
		int n=sc1.nextInt();
		
	//	int n1=sc1.nextInt();
		
		int n11=200;
		if(n11>100) {
			System.out.println("suffivient balance");
		}
		else if(n11>50) {
			System.out.println("reserve balance");
	}
		else {
			System.out.println("Zero Balance");
		}
}
}