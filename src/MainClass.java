import java.util.Scanner;			//main ���� sc9�� ��� �ϱ� ���� import 
import java.util.Random;			//main ���� rand�� ��� �ϱ� ���� import

public class MainClass {
	public static void main(String[] args) {
		// ������ ������ ���� �߷� ����
		// �����߸� ������ ����(�ִ� 10��)�� �Է� �ް�
		// ���� ������(�ִ� 10) ��ŭ �������� ������ �����߸���

		// �������� �������� ���� ��ġ�� �ޱ� ���� �迭 ����
		int[] StTree = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }; 
		// InTree = �� ���� �׷� ��
		int InTree;
		System.out.print("���ϴ� ���� ������ �Է��ϼ���(�ִ� 10�׷�) : ");
		Scanner sc = new Scanner(System.in); 			// �Է°��� ����
		InTree = sc.nextInt(); 			// �Է°��� ������ ����
		Random rand = new Random();
		for (int i = 0; i < InTree; i++) {
			int iValue = rand.nextInt(10) + 1; 			// 1 ~ 10 ������ ���� ���Ǽ��� ���� �������� ����
			StTree[i] = iValue; 			// ������� ���Ǽ��� �迭�� ����
			int b = 0;
			while (b < StTree[i]) {
				System.out.println((i + 1) + " ��° ������ ������ " + (b + 1) + "ȸ �����");
				if (b == iValue) {
					System.out.println("������ �Ѿ��");
					InTree = InTree - 1; 			// ������ �Ѿ������� �� �׷������ 1 ����
					break; 			// ������ �Ѿ������� ���� �������� ���� break
				} else {
					System.out.println("������ �Ѿ�� �ʴ´�");
					b++; 			// ��� Ƚ�� ����
				} // else
			} // while
		} // for
		for (int n = 0; n < InTree; n++) { 			// �� ���� ���ڿ� ���� ������ ������ Ȯ��
			System.out.println("�� " + InTree + "�׷� �߿� " + (n + 1) + "��° ���� �������� " + StTree[n] + " �Դϴ�.");
		} // for
	}// main
}// class