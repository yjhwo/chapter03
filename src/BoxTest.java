//03.10(1)

public class BoxTest {

	public static <T, K> void test(T t, K k){	// 이 함수에서 어떤 타입을 적용 시킬것이다 라는 뜻
		System.out.println(t+":"+k);
	}
	
	public static void main(String[] args) {
		
		test(new StringBuffer("hello"), new Integer(1));
		
		// 타입을 지정 안하게 되면 기본 타입은 Object
//		Box box = new Box();
//		box.setObject("Hello");
//		String s = (String)box.getObject();
		
		Box<String> box2 = new Box<String>();
		box2.setObject("Hello");
		
		String s = box2.getObject();	
		// 기본 타입인 경우 캐스팅 해줘야 한다는 번거로움이 있다.
//		String s = (String)box.getObject();
	}

}
