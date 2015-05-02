import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		int m3 = 10, m5 = 10, m7 = 10;
		System.out.println("请默想一个1-105的数 \n请输入，该数除以3的余数\n");
		while (m3 >= 3) {
			Scanner in = new Scanner(System.in);
			m3 = in.nextInt();
		}
		System.out.println("请默想一个1-105的数 \n请输入，该数除以5的余数\n");
		while (m5 >= 5) {
			Scanner in = new Scanner(System.in);
			m5 = in.nextInt();
		}
		System.out.println("请默想一个1-105的数 \n请输入，该数除以7的余数\n");
		while (m7 >= 7) {
			Scanner in = new Scanner(System.in);
			m7 = in.nextInt();
		}
		int d = (70 * m3 + 21 * m5 + 15 * m7) % 105;
		System.out.println("猜测的数值是" + d + "\n");
	}
}
