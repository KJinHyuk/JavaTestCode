
public class Hello2 {

	public static void main(String[] args) {

		String aName = "김진혁"; // 문자열 aName 변수값 선언
		String bName = "도라에몽"; // 문자열 aName 변수값 선언
		int aHp = 100; // aHp 변수값 선언
		int bHp = 100; // bHp 변수값 선언
		int aStr = 10; // aStr 변수값 선언
		int bStr = 1000; // bStr 변수값 선언
		System.out.print("나의 이름은"); // 문자열 출력
		System.out.print(aName); // aName 변수값 출력
		System.out.println("입니다");
		System.out.println(aName + "은 집으로 걸어 갑니다");
		System.out.println(aName + "는 " + bName + "과 마주칩니다");
		System.out.println(aName + "의 힘은 " + aStr + " 이며 " + bName + "의 힘은 " + bStr + "입니다");
		System.out.println(aName + "과 " + bName + " 의 체력은 각각 " + aHp + "," + bHp + "입니다");
		System.out.print(aName + "은 " + bName + "이 무섭습니다 ");
		System.out.print(aName + "은 뛰어서 도망 갑니다");
	}//main
}//class
