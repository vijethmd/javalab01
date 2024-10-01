import java.io.*;
import java.util.Scanner;

class ft{
	public static void main(String args[]){
		int i,fact = 1;
		System.out.println("Enter a number : ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(i = 1; i <= n;i++)
		{
			fact = fact*i;
		}						

		System.out.println(fact);

	}
}
