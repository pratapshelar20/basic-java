package StringBufferclass;

public class StringBufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(); 
//		System.out.println(sb.capacity());//default 16 
////		sb.append("Hello"); 
////		System.out.println(sb.capacity());//now 16 
		sb.append("java is my favourite language, its using for coding, as soon as selenium testing too "); 
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

	}

}
