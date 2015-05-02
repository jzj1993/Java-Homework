public class Student extends Person implements Comparable<Student> {

	protected String name, num, sex;
	protected double java, hf;
	protected double avg; // 平均分

	public Student(String name, String num, String sex, int java, int hf) {
		this.name = name;
		this.num = num;
		this.sex = sex;
		this.java = java;
		this.hf = hf;
		this.avg = java * 2.0 / 6.0 + hf * 4.0 / 6.0;
	}

	// 平均分
	public double GetAverage() {
		return avg;
	}

	@Override
	public int compareTo(Student o) {
		if (this.avg > o.avg) {
			return 1;
		} else if (this.avg < o.avg) {
			return -1;
		} else {
			return 0;
		}
	}

	public String getName() {
		return name;
	}

	public String getNum() {
		return num;
	}

	public String getSex() {
		return sex;
	}

	public double getJava() {
		return java;
	}

	public double getHf() {
		return hf;
	}
}
