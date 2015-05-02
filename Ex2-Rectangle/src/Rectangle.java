public class Rectangle {
	// 设计一个 Rectangle （矩形）类。包括：
	// 两个 double 类型的属性，分别表示高度和宽度，默认值均为 1
	// 一个 String 类型的属性，表示颜色，默认值为 "WHITE"
	// 一个无参构造方法，创建一个属性为默认值的 Rectangle 对象
	// 一个有两个参数的构造方法（分别指定高度和宽度）
	// 属性均为 private 的。为这些属性创建 accessor 和 mutator
	// 一个 getArea() 方法，返回矩形的面积
	// 一个 getPerimeter() 方法，返回矩形的周长
	// 画出 Rectangle 类的 UML类图
	private double width, height;
	private String color;

	// 构造方法
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

	// 计算面积、周长
	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}

}
