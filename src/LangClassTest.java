
public class LangClassTest {

	public static void main(String[] args) {
		Point point = new Point(3, 2);

		// 기본 Object 구현 메소드 확인
		System.out.println(point);
		System.out.println(point.hashCode()); // 객체를 유일하게 구분할 수 있는 정수 id
		System.out.println(point.toString());
		System.out.println(point.getClass());

		// ==, equals 차이점
		Point point2 = new Point(2, 3);
		Point point3 = new Point(2, 3);
		Point point4 = point2;
		
		System.out.println(point4 == point2);	// ==는 같은 객체인지만 확인
		System.out.println(point2 == point3);	
		System.out.println(point2.equals(point3));// equals는 내용이 같은지 확인
		System.out.println(point3.hashCode() == point2.hashCode());
		
		System.out.println(System.identityHashCode(point2));
		System.out.println(System.identityHashCode(point4));
	}

}
