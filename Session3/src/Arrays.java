
public class Arrays {
	public static void main(String[] args) {
		int[] a1 = {10, 20, 30, 40, 50}; 
		int a2[] = {10, 20, 30, 40, 50}; 
		
		System.out.println("a1 is: "+a1); 
		System.out.println("a2 is: "+a2); 
		
		// Explicit Sytnax
		int[] a3 = new int[]{10, 20, 30, 40, 50}; // bracket before
		int a4[] = new int[]{10, 20, 30, 40, 50}; // bracket after
		
		
		a4[1] = 111;
		a2[2] = 222;
		
		int[] a5 = new int[5]; 
		a5[0] = 11;
		//System.out.println(a5[0]);
		//System.out.println(a5[1]);
		for(int element : a5) {
			System.out.print(element+"  ");
		}
		System.out.println();
		
		int a6[], a7[], a8;
		a6 = new int[5];	
		a7 = new int[10];	
		a8 = 100; // a8 is int
		
		int[] a9, a10; 
		a9 = new int[10];
		a10 = new int[15];
		
	}

}
