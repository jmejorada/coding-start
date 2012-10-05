import java.util.StringTokenizer;


public class test {

	/**
	 * @param args
	 * 
	 * 8. Please write a method that takes a String and returns a String with the words reversed.  
	 * 
	 * The input String will consist of words of only letters and digits, each separated by a single space.  
	 * For example, if passed “I hope I pass this difficult quiz” the method will return “quiz difficult this pass I hope I”.  
	 * 
	 * Feel free to compile and run your code--because I will too!  
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(printBackwards("I hope I pass this difficult quiz"));
		
	}
	
	public static String printBackwards(String input){
		String [] vals=input.split(" ");
		int end=vals.length;
		StringBuilder result=new StringBuilder();
		while(end>0){
			result.append(vals[end-1]).append(" ");
			end--;
		}
		
		return result.toString().trim();
	}

}
