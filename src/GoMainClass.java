import java.util.Scanner;
import java.util.Random;
public class GoMainClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a;
		// 문자열 변수 선언
		String b = "쿠로미";
		String c = "마이멜로디";


		// 고백 게임 참가자 입력 받기
		System.out.println("고백 게임 시작");
		// 이름을 입력하세요를 출력하고 이름 입력 받기(문자열)
		System.out.println("이름을 입력하세요");
		b = sc.next();
		// 나이를 입력하세요 출력하고 나이 입력 받기(숫자)
		System.out.println("나이를 입력하세요");
		System.out.print("입력 : ");
		a = sc.nextInt();
		
		
		System.out.println("안녕하세요");
		System.out.println("저는"+b+"입니다");
		System.out.println("잘 부탁합니다");
		System.out.println(b+"의 친구는"+c+"입니다");
		System.out.print(c+"와 저는");
		System.out.print(" "+a+"살 입니다");

		int tr;
		
		int[] RTry = { 0, 0, 0, 0, 0 };
		
<<<<<<< HEAD

=======
		int man_num = 0;
>>>>>>> refs/remotes/origin/master
		Random rand = new Random();
		
		for(int z=0; z<RTry.length; z++) {
			int NumTry = rand.nextInt(10) + 1;
			RTry[z] = NumTry;
		}
		
		for(int j=1; j < RTry.length+1; j++) {
			System.out.println();
			System.out.println("================================");
			System.out.print(j+" 번 후보 고백 시도 횟수를 맞춰 보세요(최대 10회) ");
			tr = sc.nextInt();
			for(int i=1;i<=tr;i++) {
				System.out.println(j+"번 후보에게"+i+"회 고백을 시도했다");
				//if 고백 확률이 높을 때 고백하면
				if(i==RTry[j-1]) {
					System.out.println("모솔 탈출");
					break;
					}else {
					System.out.println("솔로입니다");
				}
			}
			if(tr == RTry[j-1]) {
				System.out.println("당신은 나와 함께 갑시다~");
				System.out.println("고백 성공");
			}else {
				System.out.println("나와 당신은 맞치 않네요~ 담에 봐요");
				System.out.println("고백 실패");
				System.out.println("결과값은 : "+RTry[j-1]+"을 시도 했어야 합니다");
			}
		}	
	}
}
