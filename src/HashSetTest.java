import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//03.10(6)

public class HashSetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("둘리");
		set.add("마이콜");
		set.add("길동");
		set.remove("마이콜");
		set.add("희동");
		
		System.out.println(set.contains("둘리"));
		
		// -----------Iterator로 Set을 순회
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
//		for(Iterator<String> it2 = set.iterator();it2.hasNext();){
//			String s = it2.next();
//			System.out.println(s);
//		}
		
		for (String s : set) {
			System.out.println(s);
		} // foreach문이 내부적으로 iterator를 구현하고 있는 것
		
	}

}
