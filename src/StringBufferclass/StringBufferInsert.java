package StringBufferclass;

public class StringBufferInsert {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello how are you "); 
		sb.insert(18,"Java is coding language");//now original string is changed 
		System.out.println(sb);//prints HJavaello 
		} 

	}


