package git_pkg;

import java.util.Scanner;

public class Example_pro 
{
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any one character from:RGB");
		String mycolor = sc.nextLine();
		sc.close();
		switch (mycolor.toUpperCase()) {
		case "R":
			System.out.println("your choice is RED");
			break;
		case "G":
			System.out.println("your choice is GREEN");
			break;
		case "B":
			System.out.println("your choice is BLUE");
			break;
		default:
			System.out.println("invalid entity");
		}
		}

}
