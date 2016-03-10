//03.10(1)

public class BoxTest {

	public static void main(String[] args) {
		
		// 타입을 지정 안하게 되면 기본 타입은 Object
		Box<String> box = new Box<String>();
		box.setObject("Hello");
		
		String s = box.getObject();	
		// 기본 타입인 경우 캐스팅 해줘야 한다는 번거로움이 있다.
//		String s = (String)box.getObject();
	}

}
