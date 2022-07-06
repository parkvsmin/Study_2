public class Var8 {
	
	public static void main(String[] args) {
		//암호화 연산식
		// ex : 1 -> 1
		//      2 -> 2
		//      3 -> 3
		//      4 -> 1몫 0나머지
		//      5 -> 1 1
		//      6 -> 1 2
		//      7 -> 1 3
		//      8 -> 2 0
		//      9 -> 2 1
		//     10 -> 2 2
		System.out.println("Start");
		
		int input =4;
		int output = input/4*10 + input%4;
		
		System.out.println("input :" + input);
		System.out.println("output : " + output);
		
			
		System.out.println("Finish");
	}

}
