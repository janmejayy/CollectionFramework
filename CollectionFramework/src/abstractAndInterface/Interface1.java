package abstractAndInterface;

public interface Interface1 {
void m1();
void m2();

class A implements Interface1 {
	    public void m1() {
		System.out.println("implementing method m1");
	    }
		public void m2() {
			System.out.println("implementing method m2");
		}
		
	}
class mainInterface{
public static void main(String[] args) {
	Interface1 obj=new A();
	obj.m1();
	obj.m2();

	
}
}
}