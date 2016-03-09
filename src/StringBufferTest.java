
public class StringBufferTest {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		 
		sb.append(" is pencil");
//		sb.append(100);
		System.out.println(sb);
		
		sb.insert(7, " my");
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		
		// StringBuffer의 method chain
		StringBuffer sb2 = new StringBuffer("This");
		sb2.append(" is pencil").insert(7, " my");
		System.out.println(sb2);
		
		
		// + 연산자의 변환
		String s = "Hello"+1234+"world";			
		String s2 = new StringBuffer("Hello").append(1234).append("world").toString();
		// 내부적으로 이와 같음
		
	}

}
