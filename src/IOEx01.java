import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

//03.10(7)

public class IOEx01 {

	public static void main(String[] args) {
		byte[] src = {0,1,2,3,4,5};
		byte[] dest = null;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(src);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int data = -1;
		
		while((data=bis.read()) != -1){
			bos.write(data);
		}
		
//		bis.close();
//		bos.close();
		
		dest = bos.toByteArray();
		// 안에 들어있는 버퍼를 만들어서 넘겨준다.
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}

}
