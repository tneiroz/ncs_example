package sampleTest;

import java.util.Scanner;

public class Test_02 {
	// 15
	// 10
  public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println(">>시작값 입력");
	String inputStart = scan.nextLine();   
	System.out.println(">>끝값 입력");
	String inputEnd = scan.nextLine();
	
	try {
		int start = Integer.parseInt(inputStart);
		int end = Integer.parseInt(inputEnd);
		int sum = 0;
		
		if(start>end) {
			int temp = end;
				end = start;
			    start = temp;
		}
		
		for(int i = start; i<=end ; i++) {
			sum +=i;
			
		}
		System.out.println("합계 :" + sum);
	} catch (Exception e) {
		System.out.println("올바른 값을 입력하세요");
	}
  }
}
