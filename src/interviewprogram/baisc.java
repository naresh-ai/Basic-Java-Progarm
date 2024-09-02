package interviewprogram;

import java.util.Scanner;

public class baisc {
	public static void main(String[] args) {
		int x;
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter your number");
		x=Sc.nextInt();
		if(x%2==0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}
		
	}

}
