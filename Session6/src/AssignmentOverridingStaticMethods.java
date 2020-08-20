
class Parent{
	public static void display() {
		System.out.println("Parent Method");
	}
}
class Child extends Parent{
      public  static void display() {
		System.out.println("Child Method");
	}
}
public class AssignmentOverridingStaticMethods {
	public static void main(String[] args) {
	Parent c=new Child();
	c.display();
	}

}
