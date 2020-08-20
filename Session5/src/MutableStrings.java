
public class MutableStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Hello");
		String newStr = str.concat(" World");
		
		System.out.println("str is: "+str);			
		System.out.println("newStr is: "+newStr);	
		
				
		StringBuffer buffer = new StringBuffer("Hello");
		buffer.append(" World");
		
		System.out.println("buffer is: "+buffer);	
		
		
		
		StringBuilder builder = new StringBuilder("Hello");
		builder.append(" World");
		
		System.out.println("builder is: "+builder);	
		

	}

}
