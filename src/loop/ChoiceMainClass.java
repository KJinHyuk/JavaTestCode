package loop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ChoiceMainClass {

	public static void main(String[] args) {
		System.out.println("오늘은 또 뭐 먹지?");
		String a = "0";
		int b = 0;
		ArrayList<String> meal = new ArrayList<String>();
		meal.add("아침");
		meal.add("점심");
		meal.add("저녘");
				
		ArrayList<String> menu = new ArrayList<String>();
				 
		Scanner nMenu = new Scanner(System.in); 
		System.out.println("/* 0 을 입력하면 저장 종료*/");		
		while(true) {
			System.out.print("메뉴를 입력 하세요 : ");
			String aMenu = nMenu.nextLine();
			System.out.println("");
			if (aMenu.equals(a)){
				System.out.println("너무 배고프니 이중에서 선택 합시다.");
				System.out.println("");
				break;
			}else {
				menu.add(aMenu);
			}
		}
		for(String m : menu) {
			System.out.println(m+"이(가) 저장 되어 있습니다");
		}
		System.out.println("");
		Random rand = new Random();
		while(b<3) {
			int c = rand.nextInt(menu.size());
			System.out.println(meal.get(b)+"의 메뉴 추천은 "+menu.get(c)+" 입니다.");
			b++;
		}// while
	}// main
}// Class
