import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {

		double x, y, pi;
		System.out.println("ѡ����ٸ�����������й���");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num = 0;
		for (int i = 0; i < n; i++) {
			x = Math.random();
			y = Math.random();
			if (x * x + y * y <= 1) {
				num++;
			}
		}
		pi = (num * 4.000) / n;
		System.out.println("Pi is around" + pi);
	}
}


