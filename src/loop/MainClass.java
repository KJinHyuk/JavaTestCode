package loop;

import java.util.Scanner;			//main 에서 sc9를 사용 하기 위한 import 
import java.util.ArrayList;
import java.util.Random;			//main 에서 rand를 사용 하기 위한 import

public class MainClass {
	public static void main(String[] args) {
		// 나무를 도끼로 쓰러 뜨려 보자
		// 쓰러뜨릴 나무의 갯수를 입력 받고
		// 나무 내구도(최대 10) 만큼 도끼질로 나무를 쓰러뜨리자

		// 나무들의 내구도를 랜덤 수치로 받기 위한 배열 선언
		ArrayList<Integer> StTree = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in); 	// Scanner 호출
		Random rand = new Random();				// Random 호출
//		int[] StTree = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; 
		// InTree = 총 나무 그루 수
		int InTree;
		System.out.print("원하는 나무 갯수를 입력하세요 : ");
		InTree = sc.nextInt(); 					// 입력값을 변수에 저장
		for (int i = 0; i < InTree; i++) {
			StTree.add(rand.nextInt(10) + 1); 	// 1 ~ 10 사이의 값을 임의수를 나무 내구도로 저장
			int iValue = StTree.get(i); 			    // 순서대로 임의수를 리스트에 저장
			int b = 0;
			while (b < iValue) {
				System.out.println((i + 1) + " 번째 나무를 도끼로 " + (b + 1) + "회 찍었다");
				if (b == iValue) {
					System.out.println("나무가 넘어간다");
					InTree = InTree - 1; 	// 나무가 넘어졌으니 총 그루수에서 1 감소
					break; 			// 나무가 넘어졌으니 다음 나무가기 위한 break
				} else {
					System.out.println("나무가 넘어가지 않는다");
					b++; 			// 찍는 횟수 증가
				} // else
			} // while
		} // for
		
		// 총 나무 숫자와 각각 나무의 내구도 확인
		for (int n = 0; n < InTree; n++) {	
			System.out.println("총 " + InTree + "그루 중에 " + (n + 1) + "번째 나무 내구도는 " + StTree.get(n) + " 입니다.");
		}// for
	}// main
}// class
