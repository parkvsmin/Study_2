import java.util.Scanner;

public class Operator2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력 하세요");
		//1.나이를 입력받아서 10대 유무를 판별
		
		int age = sc.nextInt();
		String result = age >=10 && age <20 ? "10대입니다" : "10대가 아닙니다";
		
		System.out.println(result);
		
		System.out.println("물건의 가격을 입력하세요");
		//2. 물건의 가격이 30000원 이상이면 배송료가 무료 아니면 배송료
		//   아니면 배송료가 가격의 10%로 책정
		//   최종 지불비용을 출력하세요
		
		int price = sc.nextInt();
		int cart = price >= 30000 ? 0 :(int) (price*0.1);
		// price = price>=30000 ? price : price + (int) (price*0.1);
		price = price+cart;
		
		System.out.println(price);
		//String result = price >= 30000 ?
		
		
		

	}

}
