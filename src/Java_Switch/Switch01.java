package Java_Switch;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number::");
		int iSwitch = sc.nextInt();
		 switch(iSwitch){
		 case 0:
		 System.out.println("ZERO");
		 break;
		 case 1:
		 System.out.println("ONE");
		 break;
		 case 2:
		 System.out.println("TWO");
		 break;
		 case 3:
		 System.out.println("THREE");
		 break;
		 case 4:
		 System.out.println("FOUR");
		 break;
		 default:
		 System.out.println("Not in the list");
		 break;
		}
		}
		
	

}
