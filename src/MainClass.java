public class MainClass {

	public static void main(String[] args) {
		// 목표 : 도끼 찍기로 어떤 나무 인지 찾기?
		// 반복문(for),조건문(if,elseif)으로 코드 구성
		// 각각의 나무의 특성은 도끼질을 버티는 횟수로 결정
		// aTree 나무는 7회
		// bTree 나무는 2회
		// cTree 나무는 1회
		// dTree 나무는 9회
		// eTree 나무는 5회

		// 각각 나무의 문자열(나무명) 선언
		String aNum = "aTree";
		String bNum = "bTree";
		String cNum = "cTree";
		String dNum = "dTree";
		String eNum = "eTree";

		// 5그루의 나무가 각각 서있는 자리 정의
		String SoketOne = "";
		String SoketTwo = "";
		String SoketThree = "";
		String SoketFour = "";
		String SoketFive = "";

		int tree = 5; // 나무의 총 그루 수
		int aNTree = 3; // aTree의 내구도
		int bNTree = 2; // bTree의 내구도
		int cNTree = 1; // cTree의 내구도
		int dNTree = 4; // dTree의 내구도
		int eNTree = 5; // eTree의 내구도

		// 도끼로 찍어 보자
		// 나무가 넘어질 때까지 도끼질을 하고 넘어지면 정지

		// 첫번째 칸(SoketOne)자리 나무
		for (int i = 1; i < 6; i++) {
			System.out.println("의문의 나무를 도끼로 " + i + "회 찍었다");
			int AbTree = cNTree; // AbTree = 도끼질 횟수와 나무의 내구도를 비교하기 위해 for문 내부선언
			if (i == AbTree) {
				System.out.println("나무가 넘어간다");

				// 넘어진 나무의 내구도로 나무 이름을 찾기위한 조건문
				if (AbTree == 1) {
					SoketOne = cNum;
				} // if
				else if (AbTree == 2) {
					SoketOne = bNum;
				} // elseif
				else if (AbTree == 3) {
					SoketOne = aNum;
				} // elseif
				else if (AbTree == 4) {
					SoketOne = dNum;
				} // elseif
				else {
					SoketOne = eNum;
				} // else
				tree = tree - 1; // 나무가 넘어졌으니 총 그루수에서 1 감소
				i = 6; // 나무가 넘어졌으니 더는 도끼질 할 이유가 없어서 for문에서 exit
			} // if
			else {
				System.out.println("나무가 넘어가지 않는다");
			} // else
		} // for
		System.out.print("넘어간 나무는?");
		System.out.println(" " + SoketOne);
		System.out.print("남아있는 나무의 수는? ");
		System.out.println(tree);
		System.out.println(" ");

		// 두번째 칸(SoketTwo)자리 나무 (이후에는 Ctrl+ C + V)
		for (int i = 1; i < 6; i++) {
			System.out.println("의문의 나무를 도끼로 " + i + "회 찍었다");
			int AbTree = bNTree;
			if (i == AbTree) {
				System.out.println("나무가 넘어간다");
				if (AbTree == 1) {
					SoketTwo = cNum;
				} // if
				else if (AbTree == 2) {
					SoketTwo = bNum;
				} // elseif
				else if (AbTree == 3) {
					SoketTwo = aNum;
				} // elseif
				else if (AbTree == 4) {
					SoketTwo = dNum;
				} // elseif
				else {
					SoketTwo = eNum;
				} // else
				tree = tree - 1;
				i = 6;
			} // if
			else {
				System.out.println("나무가 넘어가지 않는다");
			} // else
		} // for
		System.out.print("넘어간 나무는?");
		System.out.println(" " + SoketTwo);
		System.out.print("남아있는 나무는? ");
		System.out.println(tree);
		System.out.println(" ");

		// 세번째 칸(SoketThree)자리 나무
		for (int i = 1; i < 6; i++) {
			System.out.println("의문의 나무를 도끼로 " + i + "회 찍었다");
			int AbTree = dNTree;
			if (i == AbTree) {
				System.out.println("나무가 넘어간다");

				if (AbTree == 1) {
					SoketThree = cNum;
				} // if
				else if (AbTree == 2) {
					SoketThree = bNum;
				} // elseif
				else if (AbTree == 3) {
					SoketThree = aNum;
				} // elseif
				else if (AbTree == 4) {
					SoketThree = dNum;
				} // elseif
				else {
					SoketThree = eNum;
				} // else
				tree = tree - 1;
				i = 6;
			} // if
			else {
				System.out.println("나무가 넘어가지 않는다");
			} // else
		} // for
		System.out.print("넘어간 나무는?");
		System.out.println(" " + SoketThree);
		System.out.print("남아있는 나무는? ");
		System.out.println(tree);
		System.out.println(" ");

		// 네번째 칸(SoketFour)자리 나무
		for (int i = 1; i < 6; i++) {
			System.out.println("의문의 나무를 도끼로 " + i + "회 찍었다");
			int AbTree = eNTree;
			if (i == AbTree) {
				System.out.println("나무가 넘어간다");

				if (AbTree == 1) {
					SoketFour = cNum;
				} // if
				else if (AbTree == 2) {
					SoketFour = bNum;
				} // elseif
				else if (AbTree == 3) {
					SoketFour = aNum;
				} // elseif
				else if (AbTree == 4) {
					SoketFour = dNum;
				} // elseif
				else {
					SoketFour = eNum;
				} // else
				tree = tree - 1;
				i = 6;
			} // if
			else {
				System.out.println("나무가 넘어가지 않는다");
			} // else
		} // for
		System.out.print("넘어간 나무는?");
		System.out.println(" " + SoketFour);
		System.out.print("남아있는 나무는? ");
		System.out.println(tree);
		System.out.println(" ");

		// 다섯번째 칸(Soketfive)자리 나무
		for (int i = 1; i < 6; i++) {
			System.out.println("의문의 나무를 도끼로 " + i + "회 찍었다");
			int AbTree = aNTree;
			if (i == AbTree) {
				System.out.println("나무가 넘어간다");

				if (AbTree == 1) {
					SoketFive = cNum;
				} // if
				else if (AbTree == 2) {
					SoketFive = bNum;
				} // elseif
				else if (AbTree == 3) {
					SoketFive = aNum;
				} // elseif
				else if (AbTree == 4) {
					SoketFive = dNum;
				} // elseif
				else {
					SoketFive = eNum;
				} // else
				tree = tree - 1;
				i = 6;
			} // if
			else {
				System.out.println("나무가 넘어가지 않는다");
			} // else
		} // for
		System.out.print("넘어간 나무는?");
		System.out.println(" " + SoketFive);
		System.out.print("남아있는 나무는? ");
		System.out.println(tree);
		System.out.println(" ");
		System.out.println("나무는 " + SoketOne + ", " + SoketTwo + ", " + SoketThree + ", " + SoketFour + ", " + SoketFive
				+ " 순서로 서있습니다.");

	} // main
} // class
