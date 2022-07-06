
public class Operator1 {

	public static void main(String[] args) {
		
		int count = 0;
		
		count = count+1; //1
		count = count+1; //2
		
		count = 0;
		
		++count; //선행 count+1
		count++; //후행 count+1
		
		System.out.println(++count); //3
		System.out.println(count++); //3
		System.out.println(count); //4
		
		count = 0;
		
		int result = ++count;
		System.out.println(count); //1
		System.out.println(result); //1
		
		result = count++; //count++ = result
		System.out.println(count); //2
		System.out.println(result); //1
		
		result = result-4; // result-=4;
		
		result-=4;
		

	}

}
