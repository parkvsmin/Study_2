public class Var9 {

	public static void main(String[] args) {
		System.out.println("Start");
		//편의점 계산 자동화 프로그램
		//물건 가격의 총합계
		int price = 34500;
		//손님이 낸 돈
		int money = 50000;
		//거스름돈 계산
		int jandon =(money-price); // 15500;
		
		
		System.out.println(jandon/10000);
		System.out.println(jandon%10000/1000);
		System.out.println(jandon%1000/100);
		System.out.println(jandon%100/10);
		//만원짜리 갯수를 담을 변수
		int man = jandon/10000;
		//천원짜리 갯수를 담을 변수
		//int cheon = (jandon - (man*10000))/1000;
		int cheon = jandon%10000/1000;
		//System.out.println("cheon");
		//백원짜리 갯수를 담을 변수
		int back = (jandon - (man*10000) - (cheon*1000))/100;
		//int back = jandon&1000/100;
		//System.out.println("back");
		//십원짜리 갯수를 담을 변수
		int sib = jandon%100/10;
		
		System.out.println("만원 : "+man +" 장");
		System.out.println("천원 : "+cheon +" 장");
		System.out.println("몇 : "+back +" 개");
		System.out.println("몇 : "+sib +" 개");
			
		System.out.println("Finish");

	}

}
