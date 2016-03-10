import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("고길동");
		list.add("마이콜");
		list.add("둘리");
		
		list.remove(2);
		
		// 순회 1
		int size = list.size();
		for(int i=0; i<size; i++){
			String s = list.get(i);
			System.out.println(s);
		}
		
		// 순회 2
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		// 순회 3
		for(String s : list){
			System.out.println(s);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);	// auto boxing	
	}

}
