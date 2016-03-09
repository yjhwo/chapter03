// 03.09(1)

public class StringTest01 {

	public static void main(String[] args) {
		String str = "Hello \"Java\"";
		System.out.println(str);
		
		String str2 = str.toUpperCase();
		String str4 = str2.concat("??");
		String str5 = "!".concat(str2).concat("@");
		
		System.out.println("str: "+str);
		System.out.println("str2: "+str2);
		System.out.println("str4: "+str4);
		System.out.println("str5: "+str5);
		
	}

}
