
public class Var6 {

	public static void main(String[] args) {		
		System.out.println("Start");
		//형변환(Cascading)
		int num1 = 10;
		
		long num2 = 20L;
		num2 = num1; // 작은거에서 큰거는 자동형변환
		num1 = (int)num2; //강제형변환
		//같은 데이터타입 끼리만 연산 가능
		//primitive type끼리만 가능
		//boolean제외
		System.out.println(20+20L);
		
		//byte short int(4) long(8) float(4) double(8) char(2)
		char ch ='a';
		num1 = ch;
		num2 = num1;
		float f = num2;
		// 1.0000001
		// 1.0000002
		
		int k = 35;
		int m = 35;
		int e = 37;
		int t = k+m+e;
		//double v = t/3; 정수/정수 = 정수 (소수점x)
		double v = (double)t/3; // = t/(double)3;  = t/3.0;
		
		System.out.println(t);
		System.out.println(v);
		
		num1 = 'a';
		
		System.out.println(num1);
		
		num1 = 'b';
		
		System.out.println(num1);
		
		num1 = 'z';
		
		System.out.println(num1);
		
		char c = (int)60;
		
		System.out.println(c);
		
		
		System.out.println("Finish");

	}

}
