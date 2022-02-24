package abstractAndInterface;

abstract class abstractClass {
	public abstract void method1();
	
}
class B extends abstractClass{

	@Override
	public void method1() {
     System.out.println("I am implementing abstract method");		
	}
	public static void main(String[] args) {
		B obj=new B();
		obj.method1();
	}
}