package abstractAndInterface;

interface MultipleInheritance {

}
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  
class A7 implements Printable,Showable,MultipleInheritance{  
public void print()
{System.out.println("Hello");
}  
public void show()
{System.out.println("Welcome");
}  
 class mainMultiple{ 
public static void main(String args[]){  
A7 obj = new A7();  
obj.print();  
obj.show();  
 }  
}  }
