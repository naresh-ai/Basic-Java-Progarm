package interviewprogram;

import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ypour number");
		n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				count++;
				}
		}if(count==2) {
			System.out.println("primer num");
		}else {
			System.out.println("noyt pri");
		}
	}

}
