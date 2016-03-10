import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//03.10(5)

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		// map.put("one", new Integer(1));
		map.put("one", 1); // auto boxing이 일어난 것. 1이 들어간게 아니라 객체가 들어 간 것
		map.put("two", 2);
		map.put("three", 3);

		// Integer i = map.get("one");
		int i = map.get("one"); // auto unboxing
		System.out.println(i);

		map.put("one", 4); // 같은 key값이면 value를 덮는다.
		i = map.get("one");
		System.out.println(i);

		map.remove("one");
		Integer j = map.get("one");
		if (j != null)
			System.out.println(j);
		
		// Key Set 가져오기
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			String s = it.next();
			System.out.println("key:"+s+", data:"+map.get(s));
			// value에 바로 접근할 수 없으니 key값을 순회하면서 value값 가져오기※
		}
	}

}
