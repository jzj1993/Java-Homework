public class Matrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[][] m1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 0, 3, 1 } };
		printMatrix(m1);
		double[][] a = { { 2 }, { 0 } };
		double[][] b = { { 2, 0 } };
		printMatrix(a);
		printMatrix(b);
		matrixMultiplier(a, m1);
		double[][] c = matrixMultiplier(a, b);
		printMatrix(c);
		double[][] d = matrixMultiplier(b, a);
		printMatrix(d);
	}

	// m1: ��ά���飬����1
	// m2����ά���飬����2
	// ����ֵ����ά���飬m1 �� m2 ��˵Ľ��
	public static double[][] matrixMultiplier(double[][] m1, double[][] m2) {
		if (m1 == null || m2 == null || m1.length == 0 || m2.length == 0) {
			return new double[0][0];
		}
		int row1 = m1.length, row2 = m2.length;// ����
		int col1 = m1[0].length, col2 = m2[0].length;// ����
		// 2����������˷�ʱ��Ҫ�� m1 ���������� m2 ��������ȡ�
		if (col1 != row2) {
			System.out.println("Error1");
			return new double[0][0];
		}
		// 1��m1��m2 �У�ÿһ�е�����������ȣ�����Ͳ��Ǿ����ˡ�
		for (int i = 1; i < row1; i++) {
			if (m1[i].length != col1) {
				System.out.println("Error2");
				return new double[0][0];
			}
		}
		for (int i = 1; i < row2; i++) {
			if (m2[i].length != col2) {
				System.out.println("Error3");
				return new double[0][0];
			}
		}
		// �������,����=����,����*����
		double m3[][] = new double[row1][col2];
		for (int r = 0; r < row1; ++r) {
			for (int c = 0; c < col2; ++c) {
				m3[r][c] = 0;
				for (int i = 0; i < col1; ++i) {
					m3[r][c] += m1[r][i] * m2[i][c];
				}
			}
		}
		return m3;
	}

	public static void printMatrix(double m[][]) {
		if (m == null) {
			return;
		}
		System.out.println("==================");
		for (int r = 0; r < m.length; ++r) {
			for (int c = 0; c < m[r].length; ++c) {
				System.out.print(m[r][c] + "   ");
			}
			System.out.println("");
		}
	}
}
