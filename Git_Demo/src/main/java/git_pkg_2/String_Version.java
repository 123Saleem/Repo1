package git_pkg_2;

import java.util.Scanner;

public class String_Version 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the version ");
		String course= "Java";
		switch(course) {
		/*case "Python":
			System.out.println("It is python Language");
			break;*/
		case "Java":
			System.out.println("Which Version have to using know");
			int version=sc.nextInt();
			switch(version){
			case 8:
				System.out.println("This is the old Vesrsion");
				break;
			case 11:
				System.out.println("This is new Vesrion have to use");
				break;
				default:
					System.out.println("This Version are not there in your Laptop");
				
			}
		}
		sc.close();
	}

}
