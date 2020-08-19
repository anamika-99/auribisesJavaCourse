
public class Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maharashtra = 148553;
		int tamilNadu = 52810;
		int andhraPradesh = 87597;
		int karnataka = 79605;
		int delhi = 10868;
		int toalActiveCases = maharashtra + tamilNadu + andhraPradesh + karnataka + delhi;
		System.out.println("Total Active Cases: "+toalActiveCases);
		int[] covid19ActiveCases = {148553, 52810, 87597, 79605, 10868};
		System.out.println("maharashtra: "+maharashtra);					// single value container
		System.out.println("covid19ActiveCases: "+covid19ActiveCases);	
		toalActiveCases = 0;
int idx=0;
		while(idx < 5) { // go till 4 i.e. less than 5
			toalActiveCases += covid19ActiveCases[idx];
			idx++;
		}
		
		System.out.println("Total Active Cases from While Loop: "+toalActiveCases);
		
		
		toalActiveCases = 0;
		idx = 0;
		
		do {
			toalActiveCases += covid19ActiveCases[idx];
			idx++;
		}while(idx<5); // check condition when we exit the loop
		
		System.out.println("Total Active Cases from do-While Loop: "+toalActiveCases);
		
		toalActiveCases = 0;
		for(int i=0;i<5;i++) {
			toalActiveCases += covid19ActiveCases[i];
		}
		
		System.out.println("Total Active Cases from for Loop: "+toalActiveCases);
		
	}

}
