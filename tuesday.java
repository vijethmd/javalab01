import java.io.*;
import java.util.Scanner;

class tuesday{

public static void main(String args[]){
	int i;
	System.out.println("Hello World");
	System.out.print("Enter number 1:");
	Scanner scanner = new Scanner(System.in);
	int n1 = scanner.nextInt();
	System.out.print("Enter number 2:");
	Scanner scanner2 = new Scanner(System.in);
	int n2 = scanner2.nextInt();
	System.out.print("Enter number 3:");
	Scanner scanner3 = new Scanner(System.in);
	int n3 = scanner3.nextInt();
	if (n1>n2)
	{
		if(n2>n3)
		{
			System.out.print(n1);
		}
		if(n3>n1)
		{
			System.out.print(n3);
		}
	}
	else
	{
		if(n3>n2)
		{
			System.out.print(n3);
		}
		else
		{
			System.out.print(n2);
		}
}
}
	}