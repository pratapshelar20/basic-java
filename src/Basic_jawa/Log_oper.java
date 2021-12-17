package Basic_jawa;

public class Log_oper {

	public static void main(String[] args) {
		// && operator
		System.out.println((51 > 23) && (18 > 52));//f
		System.out.println((15 < 63) && (84 < 75));//f
		System.out.println((56 > 30) && (86 > 56));//t
		System.out.println((25 > 33) && (48 > 35));//f
		System.out.println((57 > 43) && (88 > 56)); // t
		 System.out.println((95 > 43) && (81< 15)); // f
		 // || operator
		 System.out.println((5 < 3) || (888 >675)); // t
		 System.out.println((5 > 3) || (1238 < 985)); // t
		 System.out.println((5 < 3) || (8765 < 9565)); // t
		 // ! operator
		 System.out.println(!(15 == 64)); // t
		 System.out.println(!(35 >63)); // t

	}

}
