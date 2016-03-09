
// 실습예제 #3
public class StringTest03 {
	public static void main(String[] args) {
		
		String str = "aBcAbCabcABC";
		
		System.out.println(str.charAt(2)); // 특정 인덱스의 문자를 return
		System.out.println(str.indexOf("abc"));	// "abc"문자열이 처음으로 나타나는 인덱스
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf("abc", 7));	//7번째부터 문자열을 찾아라
		
		System.out.println(str.length());	//클래스 기반의 메소드호출
		System.out.println(str.replaceAll("a", "R"));
		System.out.println(str.substring(5));	// 5번째 인덱스부터 끝까지
		System.out.println(str.substring(0,3));
		System.out.println(str.toUpperCase());
		
		String s1 = "abc";
		String s2 = ",efg ";
		
		s1 = s1.concat(s2);	// 붙여넣기
		System.out.println("--"+s1+"--");
		
		s1 = s1.trim();		// 앞, 뒤의 공백만 제거, 안에 있는 공백 제거하려면 replaceAll사용해야..
		System.out.println("--"+s1+"--");
		
		String[] a = s1.split(",");		// 분리자
		for (String s : a) {
			System.out.println(s);
		}
		
		char[] ca = s1.toCharArray();	//char배열객체로 뽑아낼 때
		for (char c : ca) {
			System.out.println(c);
		}
		
		System.out.println(s1.toUpperCase());
	}
}
