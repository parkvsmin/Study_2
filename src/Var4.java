import java.util.Scanner;

public class Var4 {

	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc = new Scanner(System.in);
		
		String id = "";
		int password = 0;
		int repassword = 0;
		String name ="";
		String birthday = "";
		String sungbyeol ="";
		String mail="";
		
		System.out.println("아이디를 입력하세요");
		id = sc.next();
		
		System.out.println("비밀번호를 입력하세요");
		password = sc.nextInt();
		
		System.out.println("비밀번호를 재입력하세요");
		repassword = sc.nextInt();
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		
		System.out.println("생일을 입력하세요");
		birthday = sc.next();
		
		System.out.println("성별을 입력하세요");
		sungbyeol = sc.next();
		
		System.out.println("메일을 입력하세요");
		mail = sc.next();
		
		System.out.print("너의 아이디는 ");
		System.out.println(id);
		
		System.out.print("너의 비밀번호는 ");
		System.out.println(password);
		
		System.out.print("비밀번호 재입력 ");
		System.out.println(repassword);
		
		System.out.print("너의 이름은 ");
		System.out.println(name);
		
		System.out.print("너의 생일은 ");
		System.out.println(birthday);
		
		System.out.print("너의 성별은 ");
		System.out.println(sungbyeol);
		
		System.out.print("너의 메일은 ");
		System.out.println(mail);
		
		
		System.out.println("Finish");

	}

}
