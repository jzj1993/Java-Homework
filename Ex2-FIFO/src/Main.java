public class Main {

	public static void main(String[] args) {
		FifoQueue q = new FifoQueue();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
	}
}

