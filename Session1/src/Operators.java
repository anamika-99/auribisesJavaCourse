
public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data = 36;
		int buckets = 13;
		
		int hashCode = data % buckets;
		System.out.println("HashCode for data is: "+hashCode);
        hashCode += 2;		
		System.out.println("hashCode now is: "+hashCode);
		hashCode %= 5;

		System.out.println("hashCode finally is: "+hashCode);
		hashCode++;
		++hashCode;
		++hashCode;
		System.out.println("hashCode now is: "+hashCode);
		--hashCode;
		//hashCode--;
		System.out.println("hasCode after increment and decrement is: "+hashCode); // 3
		int result = ++hashCode;
		System.out.println("result is: "+result+" and hashCode is: "+hashCode);
		int i = 1;
		int j = i++ + ++i + ++i + i;
		System.out.println("i is: "+i+" and j is: "+j); 

	}

}
