package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력하세요");
	
		int number = scanner.nextInt();
		int sum = 0;
		int k;
		
		if(number%2 ==0)
			k=2;
		else{
			k=1;
		}
		for(int i =k; i<=number; i+=2) {
			sum+=i;
		}
		System.out.println(sum);
	}
}

