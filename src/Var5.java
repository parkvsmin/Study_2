import java.util.Scanner;

public class Var5 {

	public static void main(String[] args) {
		// 숫자(정수) 5번 입력 입력한 숫자의 총합 단, 변수는 최대 2개까지만 선언
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
			
		int num = 0;
		
		//합계를 저장할 변수
		int sum= 0;
		
		System.out.println("첫번쨰 숫자 입력");
		num = sc.nextInt();//3
		sum = sum + num;
		
		System.out.println("두번째 숫자 입력");
		num = sc.nextInt();//5
		sum = sum + num;
		
		System.out.println("세번쨰 숫자 입력");
		num = sc.nextInt();//7
		sum = sum + num;
		
		
		System.out.println("Finish");
		

	}

}
