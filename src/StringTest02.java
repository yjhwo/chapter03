// 03.09(2)
// 복습★★★
public class StringTest02 {

	public static void main(String[] args) {
		String s1 = "hello";
	    String s2 = "hello";
	    
	    System.out.println(s1.hashCode()+":"+s2.hashCode());
	    System.out.println( s1 == s2 );
	    
	    String s3 =  new String("hello");
	    String s4 =  new String("hello");
	    
	    System.out.println(s3.hashCode()+":"+s4.hashCode());
	    System.out.println( s3 == s4 );
	    
	    // ★★★
	    // 키 객체의 주소가 달라도 같은 값을 가지면 객체의 해쉬 코드는 같다.
	    // String 클래스의 hashcode()가 오버라이드 됐기 때문에 같은 값이 나오는 것
	    // 키 객체의 값이 같을 때 이와 같이 같은 해쉬코드를 리턴해야 
	    // 해쉬테이블, 해쉬맵 사용 시 제대로된 key로써 역할을 한다.
	    // --> 직접 만든 클래스같은 경우는 hashCode()가 오버라이드 안 되어있으므로
	    // 제대로 된 hashCode를 가져오지 못함 -> 반드시 오버라이드 해야 함
	    
	}

}
