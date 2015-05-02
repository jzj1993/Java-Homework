//
public class FifoQueue {
	private final int MAX_LEN = 4;
	private int[] queue = new int[MAX_LEN];
	private int lenth = 0;

	public void Enqueue(int d) {
		if (lenth < MAX_LEN) {
			queue[lenth++] = d;
			System.out.println(d + "入队");
		} else {
			System.out.println("队列已满！");
		}
	}

	public int Dequeue() {
		if (lenth > 0) {
			--lenth;
			int d = queue[0];
			for (int i = 0; i < lenth; ++i) {
				queue[i] = queue[i + 1];
			}
			System.out.println(d + "出队");
			return d;
		}
		System.out.println("队列为空！");
		return 0;
	}

	public int getLenth() {
		return lenth;
	}
}
