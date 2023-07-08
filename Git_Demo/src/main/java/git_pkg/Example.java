package git_pkg;

public class Example 
{
	void add() {// with out parameter and with out return Value
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition of a+b = "+c);//30
	}
	void sub(int a,int b) {// With Parameter and without  return 
		int c=a-b;
		System.out.println("Substraction of a-b = "+c);//
		
	}
	int mul(int a,int b) {//with parameter and  with return Value
		int c=a*b;
		System.out.println("Multiplication of a*b = "+c);
		return c;
		
	}
	int div() {// without parameter and with return value
		int a=10;
		int b=20;
		int c=a/b;
		System.out.println("Divisable of a/b = "+c);
		return c;
		
	}
public static void main(String[] args) {
	Example e=new Example();
	e.add();
	e.sub(1, 2);
	e.mul(3, 4);
	e.div();
}
}
