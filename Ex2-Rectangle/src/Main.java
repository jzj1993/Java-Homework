public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3, 4);
		r1.setHeight(2);
		System.out.println(r1.getArea());
		System.out.println(r2.getPerimeter());
	}

}
