package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
//3.Create Character type ArrayList and perform some operation
	public static void main(String[] args) {
		ArrayList <Character> xyz = new ArrayList <> ();
		xyz.add('A');
		xyz.add('b');
		xyz.add('r');
		xyz.add('t');
		System.out.println(xyz.size());//4
		char val = xyz.get(2);
		System.out.println(val);//r
		System.out.println(xyz.get(3));//t

	}

}
