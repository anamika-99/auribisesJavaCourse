
public class Casting {
public static void main(String[] args) {
	//casting
	int iVar1 = 100;
	byte bVar1 = (byte)iVar1; 
	System.out.println("bVar1 is: "+bVar1);//downcatsing
	int iVar2 = bVar1; 		  // UP-CASTING (Taken Care by Compiler for Us)
	System.out.println("iVar2 is: "+iVar2);
	int iVar3 = 97;
	char ch = (char)iVar3;	  // TYPE-CASTING
	
	System.out.println("ch is: "+ch);
		
		
		
}

}
