import java.io.*;
import java.util.Scanner;

class td{
	public static void main(String args[]){
		int i;
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int flag = 1;
		for(i = 2; i < n;i++)
		{
			if (n%i == 0)
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1)
		{
			System.out.print("Prime");
		}
		else
		{
			System.out.print("Composite");
		}
						


	}
}
