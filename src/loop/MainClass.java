package loop;
 
public class MainClass {

	public static void main(String[] args) {
		// ��ǥ : ���� ����  � ���� ���� ã��?
		// ������ ������ Ư���� �������� ��Ƽ�� Ƚ���� ����
		// aTree ������ 7ȸ
		// bTree ������ 2ȸ
		// cTree ������ 1ȸ
		// dTree ������ 9ȸ
		// eTree ������ 5ȸ

		//���� ������ ���ڿ�(������) ����
		String aNum = "aTree";
		String bNum = "bTree";
		String cNum = "cTree";
		String dNum = "dTree";
		String eNum = "eTree";

		//5�׷��� ������ ���� ���ִ� �ڸ� ����
		String SoketOne = "";
		String SoketTwo = "";
		String SoketThree = "";
		String SoketFour = "";
		String SoketFive = "";

		int tree = 5;	//������ �� �׷� ��
		int aNTree = 3;	//aTree�� ������
		int bNTree = 2;	//bTree�� ������
		int cNTree = 1;	//cTree�� ������
		int dNTree = 4;	//dTree�� ������
		int eNTree = 5;	//eTree�� ������

		//������ ��� ����
		//������ �Ѿ��� ������ �������� �ϰ� �Ѿ����� ����

		//ù��° ĭ(SoketOne)�ڸ� ����
		for (int i = 1; i < 6; i++) {
			System.out.println("�ǹ��� ������ ������ " + i + "ȸ �����");
			int AbTree = cNTree;		//AbTree = ������ Ƚ���� ������ �������� ���ϱ� ���� for�� ���μ��� 
			if (i == AbTree) {
				System.out.println("������ �Ѿ��");

				//�Ѿ��� ������ �������� ���� �̸��� ã������ ���ǹ�
				if (AbTree == 1){
					SoketOne = cNum;
					} //if
				else if (AbTree == 2){
					SoketOne = bNum;
				} //elseif
				else if (AbTree == 3){
					SoketOne = aNum;
				} //elseif
				else if (AbTree == 4){
					SoketOne = dNum;
				} //elseif
				else{
					SoketOne = eNum;
				} //else
				tree = tree-1;		//������ �Ѿ������� �� �׷������ 1 ����
				i = 6;			//������ �Ѿ������� ���� ������ �� ������ ��� for������ exit
				} //if
			else {
				System.out.println("������ �Ѿ�� �ʴ´�");
				} //else
			} //for
		System.out.print("�Ѿ ������?");
		System.out.println(" "+SoketOne);
		System.out.print("�����ִ� ������ ����? ");
		System.out.println(tree);
		System.out.println(" ");

		//�ι�° ĭ(SoketTwo)�ڸ� ����    (���Ŀ��� Ctrl+ C + V)
		for (int i = 1; i < 6; i++) {
			System.out.println("�ǹ��� ������ ������ " + i + "ȸ �����");
			int AbTree = bNTree;
			if (i == AbTree) {
				System.out.println("������ �Ѿ��");
				if (AbTree == 1){
					SoketTwo = cNum;
					} //if
				else if (AbTree == 2){
					SoketTwo = bNum;
				} //elseif
				else if (AbTree == 3){
					SoketTwo = aNum;
				} //elseif
				else if (AbTree == 4){
					SoketTwo = dNum;
				} //elseif
				else{
					SoketTwo = eNum;
				} //else
				tree = tree-1;
				i = 6;
			} //if
			else {
				System.out.println("������ �Ѿ�� �ʴ´�");
				} //else
			} //for
		System.out.print("�Ѿ ������?");
		System.out.println(" "+SoketTwo);
		System.out.print("�����ִ� ������? ");
		System.out.println(tree);
		System.out.println(" ");

		//����° ĭ(SoketThree)�ڸ� ����
		for (int i = 1; i < 6; i++) {
			System.out.println("�ǹ��� ������ ������ " + i + "ȸ �����");
			int AbTree = dNTree;
			if (i == AbTree) {
				System.out.println("������ �Ѿ��");

				if (AbTree == 1){
					SoketThree = cNum;
					} //if
				else if (AbTree == 2){
					SoketThree = bNum;
				} //elseif
				else if (AbTree == 3){
					SoketThree = aNum;
				} //elseif
				else if (AbTree == 4){
					SoketThree = dNum;
				} //elseif
				else{
					SoketThree = eNum;
				} //else
				tree = tree - 1;
				i = 6;
				}  //if
			else {
				System.out.println("������ �Ѿ�� �ʴ´�");
				} //else
			} //for
		System.out.print("�Ѿ ������?");
		System.out.println(" "+SoketThree);
		System.out.print("�����ִ� ������? ");
		System.out.println(tree);
		System.out.println(" ");

		//�׹�° ĭ(SoketFour)�ڸ� ����
		for (int i = 1; i < 6; i++) {
			System.out.println("�ǹ��� ������ ������ " + i + "ȸ �����");
			int AbTree = eNTree;
			if (i == AbTree) {
				System.out.println("������ �Ѿ��");

				if (AbTree == 1){
					SoketFour = cNum;
					} //if
				else if (AbTree == 2){
					SoketFour = bNum;
				} //elseif
				else if (AbTree == 3){
					SoketFour = aNum;
				} //elseif
				else if (AbTree == 4){
					SoketFour = dNum;
				} //elseif
				else{
					SoketFour = eNum;
				} //else
				tree = tree-1;
				i = 6;
				} //if
			else {
				System.out.println("������ �Ѿ�� �ʴ´�");
				} //else
			} //for
		System.out.print("�Ѿ ������?");
		System.out.println(" "+SoketFour);
		System.out.print("�����ִ� ������? ");
		System.out.println(tree);
		System.out.println(" ");

		//�ټ���° ĭ(Soketfive)�ڸ� ����
		for (int i = 1; i < 6; i++) {
			System.out.println("�ǹ��� ������ ������ " + i + "ȸ �����");
			int AbTree = aNTree;
			if (i == AbTree) {
				System.out.println("������ �Ѿ��");

				if (AbTree == 1){
					SoketFive = cNum;
					} //if
				else if (AbTree == 2){
					SoketFive = bNum;
				} //elseif
				else if (AbTree == 3){
					SoketFive = aNum;
				} //elseif
				else if (AbTree == 4){
					SoketFive = dNum;
				} //elseif
				else{
					SoketFive = eNum;
				} //else
				tree = tree - 1;
				i = 6;
				} //if
			else {
				System.out.println("������ �Ѿ�� �ʴ´�");
				} //else
			} //for
		System.out.print("�Ѿ ������?");
		System.out.println(" "+SoketFive);
		System.out.print("�����ִ� ������? ");
		System.out.println(tree);
		System.out.println(" ");
		System.out.println("������ "+SoketOne+", "+SoketTwo+", "+SoketThree+", "+SoketFour+", "+SoketFive+" ������ ���ֽ��ϴ�.");

	}	//main
}	//class