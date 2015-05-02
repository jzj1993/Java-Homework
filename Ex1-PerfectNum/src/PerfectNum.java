public class PerfectNum {

	public static void main(String[] args) {
		
		int sum;
		for (int n = 1; n <= 10000; n++) {
			sum = 0;
			for (int i = 1; i <= (n / 2); i++) {
				if (n % i == 0) {
					sum += i;
				}
			}
			if (n == sum) {
				System.out.println(n + "为完全数\n");
			}
		}
	}
}
