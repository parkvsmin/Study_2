
public class Var7 {

	public static void main(String[] args) {
		int age = 20;
		String name = "iu";
		
		System.out.println(name + age);
		
		System.out.println("당신의 이름은 " + name + "이고 나이는 " + age);
		
		System.out.println(1+1); // 2
		
		System.out.println(1+"1"); //11 문자열
		System.out.println(1+1+"1"); //21 문자열
		System.out.println("1"+1+1); //111 〃
		System.out.println(1+'1'); //50
		
		int count = 32;
		int ex = count%5; // % 나머지 구하는 연산자
		
		System.out.println(ex); 
	}

}
