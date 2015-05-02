public class Rectangle {
	// ���һ�� Rectangle �����Σ��ࡣ������
	// ���� double ���͵����ԣ��ֱ��ʾ�߶ȺͿ�ȣ�Ĭ��ֵ��Ϊ 1
	// һ�� String ���͵����ԣ���ʾ��ɫ��Ĭ��ֵΪ "WHITE"
	// һ���޲ι��췽��������һ������ΪĬ��ֵ�� Rectangle ����
	// һ�������������Ĺ��췽�����ֱ�ָ���߶ȺͿ�ȣ�
	// ���Ծ�Ϊ private �ġ�Ϊ��Щ���Դ��� accessor �� mutator
	// һ�� getArea() ���������ؾ��ε����
	// һ�� getPerimeter() ���������ؾ��ε��ܳ�
	// ���� Rectangle ��� UML��ͼ
	private double width, height;
	private String color;

	// ���췽��
	public Rectangle() {
		width = 1;
		height = 1;
		color = "WHITE";
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		color = "WHITE";
	}

	// Accessor & Mutator
	public void setWidth(double width) {
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// ����������ܳ�
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

}
