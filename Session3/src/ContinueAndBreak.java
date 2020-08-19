import java.util.*;
public class ContinueAndBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] students = {101, 705, 313, 456, 765};
		
		Scanner scanner = new Scanner(System.in); // System.in is to read from console :)
		
		System.out.println("Enter Your Roll Number to Check if You Are Selected or Not");
		int rollNum = scanner.nextInt();
		
		System.out.println("You have Entered: "+rollNum);
		
		scanner.close();
		
//		for(int i=0;i<students.length;i++) {
//			System.out.println("Checking "+rollNum+" against "+students[i]);
//			if(rollNum == students[i]) {
//				System.out.println("RollNumber: "+rollNum+" Found. You Are Selected");
//				break; 
//				}
//		}
//		
		System.out.println("===================");
		
		
		for(int i=1;i<=10;i++) {
			if(i<=5) {
				continue;			// skips the statements below and will take the loop to next iteration, saving ti,e
			}
			System.out.println("i is: "+i);
		}
		
		double[] productPrices = {1234.12, 5678.12, 6547.22, 7655.11, 4567.78};
		
		for(int i=0;i<productPrices.length;i++) {
			if(productPrices[i] <= 5000) {
				continue;
			}
			
			System.out.println("Original Price: "+productPrices[i]);
			productPrices[i] -= 0.30*productPrices[i];
			System.out.println("Price Slashed to: "+productPrices[i]);
			System.out.println("-----------");
		}
	}

}
