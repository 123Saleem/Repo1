package git_pkg;

public class Size_Pro 
{
	public static void main(String[] args) 
	{
		int num=10;
		String size = "";
		switch(num) 
		{
		case 10:
			size="small";
			System.out.println("Size  "+size);
			break;
		case 20:
			size="Medium";
			System.out.println("Size  "+size);
			break;
		case 30:
			size="large";
			System.out.println("Size  "+size);
			break;
		default:
			System.out.println("Size is Not there");
			break;
		}

	}
}

