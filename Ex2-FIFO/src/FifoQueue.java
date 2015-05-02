//
public class FifoQueue {
	private final int MAX_LEN = 4;
	private int[] queue = new int[MAX_LEN];
	private int lenth = 0;

	public void Enqueue(int d) {
		if (lenth < MAX_LEN) {
			queue[lenth++] = d;
			System.out.println(d + "���");
		} else {
			System.out.println("����������");
		}
	}

	public int Dequeue() {
		if (lenth > 0) {
			--lenth;
			int d = queue[0];
			for (int i = 0; i < lenth; ++i) {
				queue[i] = queue[i + 1];
			}
			System.out.println(d + "����");
			return d;
		}
		System.out.println("����Ϊ�գ�");
		return 0;
	}

	public int getLenth() {
		return lenth;
	}
}
