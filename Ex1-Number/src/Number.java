import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int m3 = 10, m5 = 10, m7 = 10;
		System.out.println("��Ĭ��һ��1-105���� \n�����룬��������3������\n");
		while (m3 >= 3) {
			Scanner in = new Scanner(System.in);
			m3 = in.nextInt();
		}
		System.out.println("��Ĭ��һ��1-105���� \n�����룬��������5������\n");
		while (m5 >= 5) {
			Scanner in = new Scanner(System.in);
			m5 = in.nextInt();
		}
		System.out.println("��Ĭ��һ��1-105���� \n�����룬��������7������\n");
		while (m7 >= 7) {
			Scanner in = new Scanner(System.in);
			m7 = in.nextInt();
		}
		int d = (70 * m3 + 21 * m5 + 15 * m7) % 105;
		System.out.println("�²����ֵ��" + d + "\n");
	}
}
