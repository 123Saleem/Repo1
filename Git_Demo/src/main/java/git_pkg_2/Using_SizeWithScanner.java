package git_pkg_2;

import java.util.Scanner;

public class Using_SizeWithScanner 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size Number");
		int num;
		String size;
		num=sc.nextInt();
		switch(num) {

		case 10:
			size="Small";
			System.out.println("Size is "+size);
			break;
		case 20:
			size="Medium";
			System.out.println("Size is "+size);
			break;
		case 30:
			size= "Large";
			System.out.println("Size is "+size);
			break;
			default:
				System.out.println("Size is Not there");

				
		}
		sc.close();
	}

}
