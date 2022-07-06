
public class Var2 {

	public static void main(String[] args) {
		
		//2.1234;
		double num = 2.1234;
		
		float num2 = 2.1234F;
		
		float num3 = num2;
		
		System.out.println(num);
		
		int num4 = 56789;
		System.out.println(56789);
		float num5 = 2.3256F;
		System.out.println(2.3256F);
		
		int kor =0;
		int math =0;
		int eng =0;
		int total = kor + math + eng;
		
		kor = 50;
		math = 50;
		eng = 50;
		System.out.println(total);
		System.out.println(kor + math + eng); //150
		
		char ch = '한'; //문자 한글자 리터럴 앞뒤로 ''감싸야 함
		System.out.println(ch);
		
		char ch2 = ' '; // 스페이스바 초기값
		double d1 = 0.0;// 정수는 0 초기값
		float d2 = 0.0F;// F로 초기값
		
		boolean check = true;
		check = false;
		
		boolean check2 = false; // 초기값
		
		//변수 선언 공식
		//데이터타입 변수명
		String name = "IU";
		String name2 = new String();
		
		System.out.println('b'); // char
		System.out.println('1'); // char
		System.out.println("abc"); // String
	}
}
