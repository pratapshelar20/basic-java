package If_else_Statement;

public class If_else_if {

	public static void main(String[] args) {
			
     double CGPA=65;
     
     if (CGPA<4) {
    	 System.out.println("fail");
     }
      else  if (CGPA>=100 && CGPA<80) {
    	  System.out.println("Outstanding A+");
      }
      else  if (CGPA>=80 && CGPA<70) {
    	  System.out.println("First Class A");
      }
    	  else  if (CGPA>=70 && CGPA<60) {
        	  System.out.println("Higher Second Class B+");
	}
    	  else  if (CGPA>=60 && CGPA<50) {
        	  System.out.println("Second Class B");
	}
    	  else  if (CGPA>=50 && CGPA<40) {
        	  System.out.println("Average pass class");
}
    	  else {
    		  System.out.println("Invalid Details");
    		  
    	  }
	}
}
