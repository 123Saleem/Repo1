package git_pkg;

public class Methods 
{
	void m() {
		int a=10;
	}
	void m1() {
		int b=10;
	}
	void m2() {
		int c=10;
	}
	void m4() {
		m();
		m1();
		m2();
	}
	public static void main(String[] args) {
		Methods m=new Methods();
		m.m4();
	}
}
