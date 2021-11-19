package loop;

import java.util.Random;
import java.util.Scanner;

public class BrigeMainClass {
	public static void main(String[] args) {
		// 사다리 게임
		// 규칙 참가자 들이 한명씩 왼쪽 오른쪽중에 한곳을 선택하여
		// 생존하며 총 18칸의 다리를 건너면 우승
		// 참가자가 도중 실패시 다음 참가자가 이어서 진행
		int B = 0, C = 0, Blegth = 18;
		Scanner ss = new Scanner(System.in); // 생존자 입력 스캔 선언
		Scanner sc = new Scanner(System.in); // 좌우 입력 스캔 선언

		System.out.println("이전 라운드의 생존자를 몇명인가요?");
		int JP = ss.nextInt();

		// 참여자, 다리 배열 선언
		String[] Gamer = new String[JP];
		String[] Brige = new String[Blegth];

		// 참가자 순번 정하기
		Random rand = new Random();
		int A = rand.nextInt(JP);
		System.out.println("당신의 순번은 " + (A + 1) + "입니다.");

		// 사용자 순번까지 컴퓨터들이 게임 진행
		while (C < Blegth) {
			if( A == 0) {
				break;
			}else {
				int Aa = rand.nextInt(2); // 컴퓨터 오왼 선택
			if (Aa == 0) {
				Gamer[B] = "Left";
			} else {
				Gamer[B] = "Right";
			} // else

			int Bb = rand.nextInt(2); // 다리 오왼 선택
			if (Bb == 0) {
				Brige[C] = "Left";
			} else {
				Brige[C] = "Right";
			} // else

			// 성공 실패 확인
			if (Gamer[B] == Brige[C]) {
				System.out.println((B + 1) + "참가자 예측 성공! " + (C + 1) + "번째 에서 한칸 앞으로 전진!");
				System.out.println("");
				C++;
				if (C == Blegth) {
					break;
				} // if
			} else {
				System.out.println((B + 1) + "참가자 예측 실패! Good bye");
				System.out.println("");
				B++;
				if (B == A) { // 사용자 순서가 오면 while 다음 while로 이동
					break;
				} // if
			}
			} // else
		} // while

		// 사용자 차례
		while (C < Blegth) {
			System.out.println("당신 순서입니다.");
			System.out.println("Right or Left?");
			String RR = sc.nextLine(); // 참가자 오왼 선택
			Gamer[B] = RR;
			int Bb = rand.nextInt(2); // 다리 오왼 선택
			if (Bb == 0) {
				Brige[C] = "Left";
			} else {
				Brige[C] = "Right";
			} // else

			// 성공 실패 확인
			if (Gamer[B] == Brige[C]) {
				System.out.println((B + 1) + "참가자 예측 성공! " + (C + 1) + "번째 에서 한칸 앞으로 전진!");
				System.out.println("");
				C++;
				if (C == Blegth) {
					break;
				} // if
			} else {
				System.out.println((B + 1) + "참가자 예측 실패! Good bye");
				System.out.println("");
				B++;
				break;
			} // else
		} // while



		// 사용자 이후 순번 컴퓨터들이 게임 진행
		while (C < Blegth) {
				if(B == Gamer.length) {
					break;
				}
				System.out.println(A);
				System.out.println(B);
				System.out.println(C);
				System.out.println(Blegth);
				int Aa = rand.nextInt(2); // 컴퓨터 오왼 선택
				if (Aa == 0) {
					Gamer[B] = "Left";
				} else {
					Gamer[B] = "Right";
				} // else

				int Bb = rand.nextInt(2); // 다리 오왼 선택
				if (Bb == 0) {
					Brige[C] = "Left";
				} else {
					Brige[C] = "Right";
				} // else

				// 성공 실패 확인
				if (Gamer[B] == Brige[C]) {
					System.out.println((B + 1) + "참가자 예측 성공! " + (C + 1) + "번째 에서 한칸 앞으로 전진!");
					System.out.println("");
					C++;
					if (C == Blegth) {
						break;
					}
				} else {
					System.out.println((B + 1) + "참가자 예측 실패! Good bye");
					System.out.println("");
					if (B == A) {
						break;
					} // if
				} // else
				} // while

// 최종적으로 통과한 인원 count
		if (C == Blegth) {
			System.out.println("다리 건너기 성공! 라운드 통과를 축하 드려요!");
			System.out.println("다리 건너기 게임을 종료 합니다.");
			System.out.println("이번 라운드 통과자는 총 " + (JP - B) + "명 입니다.");
		} else {
			System.out.println("다리 건너기 게임을 종료 합니다.");
			System.out.println("이번 라운드 통과자는 총 " + (JP - B) + "명 입니다.");
		} // else
	}// main
}// class