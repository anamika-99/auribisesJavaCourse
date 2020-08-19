import java.util.Scanner;

public class DecToBinaryRecursion {
	
	public static int DectoBinary(int dec) {
		
		if (dec == 0)  
            return 0;  
              
        else
          
        return (dec % 2 + 10 *  
                DectoBinary(dec / 2)); 
		
 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int dec=s.nextInt();
		System.out.print(DectoBinary(dec));

	}

}
