package patterns;

import java.util.Scanner;

public class patterns4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int a = sc.nextInt();
		System.out.println("Enter the number of coloumns ");
		int b = sc.nextInt();
		for(int i=1;i<=a;i++) {
			
			for(int j=b-i;j>=0;j--) 
		    {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}



}