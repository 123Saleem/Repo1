package git_pkg_2;

public class Switch_For 
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			switch(i) {
			case 0:
				System.out.println("i value is 0");
				break;
			case 1:
				System.out.println("i value is 1");
				break;
			case 2:
				System.out.println("i value is 2");
				break;
			/*case 3:
				System.out.println("i value is 3");
				break;
			case 4:
				System.out.println("i value is 4");
				break;*/
				default:
					System.out.println("Given number greter than 2 to lesthan 5");
			}
		}
	}
}
