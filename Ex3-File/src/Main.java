import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException,
			InvalidDataException {
		Scanner in = new Scanner(System.in);
		System.out.println("Input Filename:");
		String fname = in.next();
		readAndPrint(fname);
		Process(fname);
	}

	static void readAndPrint(String filename) throws IOException {
		File f = new File(filename);
		BufferedReader reader = new BufferedReader(new FileReader(f));
		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		System.out.println("Read Finish.");
		System.out.println("---------------------");
	}

	static void Process(String filename) throws IOException,
			InvalidDataException {
		File f = new File(filename);
		BufferedReader reader = new BufferedReader(new FileReader(f));
		String sline = null;
		int line = 1;
		String name, num, sex;
		char monitor;
		int java, hf;
		ArrayList<Student> list = new ArrayList<Student>();
		while ((sline = reader.readLine()) != null) {
			String[] s = sline.split(",");
			if (s != null && s.length == 6) {
				name = s[0];
				num = s[1];
				sex = s[2];
				monitor = s[3].charAt(0);
				java = Integer.parseInt(s[4]);
				hf = Integer.parseInt(s[5]);
				if (java < 0 || java > 100 || hf < 0 || hf > 100
						|| (monitor != 'Y' && monitor != 'N')
						|| (!sex.equals("男") && !sex.equals("女"))) {
					System.out.println("Error: Line " + line + " of File "
							+ filename + "\n");
					throw new InvalidDataException();
				} else {
					if (monitor == 'Y') {
						list.add(new Monitor(name, num, sex, java, hf));
					} else {
						list.add(new Student(name, num, sex, java, hf));
					}
				}
			} else {
				System.out.println("Error: Line " + line + " of File "
						+ filename + "\n");
				throw new InvalidDataException();
			}
			++line;
		}
		Collections.sort(list);
		// 按照升序输出学生的平均分
		// 计算两门课的均值、方差；学生平均分的均值、方差
		double[] sum = { 0, 0, 0 }; // Xi的和
		double[] squareSum = { 0, 0, 0 }; // Xi的平方和
		for (int i = 0; i < list.size(); ++i) {
			Student s = list.get(i);
			System.out.println(s.getName() + ",\t" + s.getNum() + ",\t"
					+ new DecimalFormat("0.00").format(s.GetAverage()));
			sum[0] += s.getJava();
			sum[1] += s.getHf();
			sum[2] += s.GetAverage();

			squareSum[0] += Math.pow(s.getJava(), 2);
			squareSum[1] += Math.pow(s.getHf(), 2);
			squareSum[2] += Math.pow(s.GetAverage(), 2);
		}
		double[] avg = new double[3];
		avg[0] = sum[0] / list.size();
		avg[1] = sum[1] / list.size();
		avg[2] = sum[2] / list.size();
		double[] sigma = new double[3];
		sigma[0] = Math.sqrt((squareSum[0] - sum[0] * sum[0] / list.size())
				/ (list.size() - 1));
		sigma[1] = Math.sqrt((squareSum[1] - sum[1] * sum[1] / list.size())
				/ (list.size() - 1));
		sigma[2] = Math.sqrt((squareSum[2] - sum[2] * sum[2] / list.size())
				/ (list.size() - 1));
		System.out.println("Java    avg = "
				+ new DecimalFormat("0.00").format(avg[0]) + ", sigma = "
				+ new DecimalFormat("0.00").format(sigma[0]));
		System.out.println("HF      avg = "
				+ new DecimalFormat("0.00").format(avg[1]) + ", sigma = "
				+ new DecimalFormat("0.00").format(sigma[1]));
		System.out.println("Average avg = "
				+ new DecimalFormat("0.00").format(avg[2]) + ", sigma = "
				+ new DecimalFormat("0.00").format(sigma[2]));
	}

}
