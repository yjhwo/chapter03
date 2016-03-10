import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//03.10(3)

public class QueueTest {

	public static void main(String[] args) {
		
//		List list = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();
		
		queue.offer("둘리");
		queue.offer("마이콜");
		queue.offer("길동");
		// |길동|마이콜|둘리|
		
		String s = queue.poll();	// 빼냄
		System.out.println(s);
		System.out.println(queue.size());
		
		s = queue.peek();		// 큐의 top 리턴
		System.out.println(s);
		System.out.println(queue.size());
		
		queue.poll();
		queue.poll();
		System.out.println(queue.size());
		
	}

}
