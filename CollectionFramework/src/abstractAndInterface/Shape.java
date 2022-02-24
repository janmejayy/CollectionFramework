package abstractAndInterface;

import java.util.Scanner;
import java.lang.Math.*;
abstract class Shape{
		int width;
		abstract void area();  
		}  
		
		class Square extends Shape{  
		public Square(int x) {
			this.width=x;
			
			}

		void area(){
			int Area=width*width;
			System.out.println(Area);}  
		}  
		class Circle extends Shape{  
		public Circle(int y) {
			this.width=y;
			
 			}

		void area(){
			double Area=Math.PI*width*width;
			System.out.println(Area);}  
		}  
		//In real scenario, method is called by programmer or user  
		class abstractMainClass{  
			
		public static void main(String args[]){  
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			int y=sc.nextInt();
			
		Square sq=new Square(x);
		Circle s=new Circle(y); 
		sq.area();
		s.area();
		}  
		}  