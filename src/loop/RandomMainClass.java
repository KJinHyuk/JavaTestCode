package loop;

import java.util.Scanner;
import java.util.Random;

public class RandomMainClass {
	public static void main(String[] args) {
		//** 문어 게임 **//
		//규칙 : 각자 10개의 구슬을 가지고 원하는 갯수를 뽑아 공수 교대로 홀짝
		//		 맞추면 뽑은 구슬을 상대방에게 주며, 가진 구슬이 먼저 20개가 되면 승리
		
		int ComBall = 10, UserBall = 10; // 각각 선수에게 지급되는 구슬 갯수
		String UserResult; // 사용자의 홀 짝 저장값
		String ComResult; // B선수의 홀 짝 저장값
		Scanner Pp = new Scanner(System.in);
		Scanner Br = new Scanner(System.in); // 홀짝 입력값 받기위한 sc 선언
		Scanner Cr = new Scanner(System.in); // 구슬 갯수값 받기위한 sc 선언
		Random rand = new Random(); // 상대방의 구슬뽑는 갯수를 임의로 뽑기위한 rand 선언

		// 참가 인원 정하기
		System.out.println("생존게임 1Round 참가자 수를 정해 주세요");
		System.out.println("인원 수가 홀수 일경우 마지막 참가자는 버립니다.");
		int Pnum = Pp.nextInt();

		if (Pnum % 2 == 0) { // 참가인원이 짝수 이면 바로 진행
			System.out.println("참가신청이 완료 되었습니다.");
			System.out.println("제 1 경기 구슬 홀짝이 시작됩니다.");
		} else { // 홀수 이면 -1명 제외
			System.out.println("마지막 참가자를 제외한 참가신청이 완료 되었습니다.");
			System.out.println("제 1 경기 구슬 홀짝이 시작됩니다.");
			Pnum -= 1;
		} // else

		// 홀짝 게임 시작
		while (true) {
			// 게임 종료 조건
			if (UserBall == UserBall * 2) {
				break;
			} else if (UserBall == 0) {
				break;
			}

			System.out.print("당신의 공격 입니다.");
			System.out.println("상대방이 뽑을 구슬을 정합니다.");

			String UserReslt = "o";
			String ComReslt = "o";

			int b = rand.nextInt(ComBall) + 1; // 컴퓨터가 구슬을 뽑음

			// 컴퓨터의 구슬의 홀짝 판단
			if (b % 2 == 0) {
				ComResult = "짝";
			} else {
				ComResult = "홀";
			} // else

			System.out.print("상대방은 홀 일까요 짝 일까요?(홀, 짝)");
			System.out.println("");
			String BallResult = Br.nextLine();

			// 대결 과정 탐색//
			if (BallResult == ComResult) {
				System.out.println("예측 성공! 상대방이 뽑은 구슬을 가져 옵니다.");
				System.out.println("");
				UserBall = UserBall + b; // 컴퓨터의 구슬 획득
				ComBall = ComBall - b; // 컴퓨터의 구슬이 차감
			} else {
				System.out.println("예측 실패! 공수가 교대 됩니다.");
				System.out.println("");

			} // else

			System.out.println("뽑을 구슬의 수를 입력하세요(1 ~ " + UserBall + ")");
			int A = Cr.nextInt();

			// 유저가 뽑은 구슬의 홀 짝 판단
			if (A % 2 == 0) {
				UserResult = "짝";
			} else {
				UserResult = "홀";
			} // else

			System.out.println("상대방이 예측을 시작 합니다.");
			System.out.println("");

			int c = rand.nextInt(UserBall) + 1; // 사용자가 가진 총 구슬 갯수 에서 렌덤수 한개로 뽑음

			// 임의로 뽑은수 홀짝 판단
			if (c % 2 == 0) {
				ComResult = "짝";
			} else {
				ComResult = "홀";
			} // else

			System.out.println("상대방의 선택은 " + ComResult + " 입니다.");

			// 대결 과정 탐색//
			if (UserResult == ComResult) {
				System.out.println("예측 성공! 상대방에게 구슬을 줍니다.");
				System.out.println("");
				ComBall = ComBall + A; // 나의 구슬을 컴퓨터 획득
				UserBall = UserBall - A; // 나의 구슬이 차감
			} else {
				System.out.println("예측 실패! 공수가 교대 됩니다.");
				System.out.println("");
			} // else
		} // while

		// 게임 승리 패배 판단
		if (UserBall > 20) {
			System.out.println("게임 에서 승리 하였습니다.");
			System.out.println("다음 라운드에 진출 합니다.");
		} else {
			System.out.println("게임 에서 패배 하였습니다.");
			System.out.println("");
			System.out.println("");
			System.out.println("Good Bye");
		} // else

		int z = Pnum / 2;
		System.out.println("다음 라운드 진출자는 총 " + z + "명 입니다.");

	}// Main
}// Class