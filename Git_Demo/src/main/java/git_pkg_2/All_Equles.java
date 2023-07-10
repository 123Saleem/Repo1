package git_pkg_2;

public class All_Equles 
{
	public static void main(String[] args) {
		int a=10,b=10,c=10;
		
		if((a>b ) &&  (a>c) ){
			System.out.println("The Beggest Value is a");
		}
		else if((b>a)&&(b>c)) {
			System.out.println("The Beggest Value is b");

		}
		else if((c>a)&&(c>b)) {
			System.out.println("The Beggest Value is c");
		}
		else {
			System.out.println("All are equles");
		}
	}
}
