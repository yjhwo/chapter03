import java.io.FileInputStream;
import java.io.InputStreamReader;

// 03.11 (2)

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try {
			// UTF-8 파일 읽기
			FileInputStream fis = new FileInputStream("UTF8.txt");
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
			
			int data = -1;
			
			while((data = isr.read()) != -1){
				System.out.print((char)data);	
			}
			isr.close();
			
			System.out.println();
			
			// MS949 파일 읽기
			FileInputStream fis2 = new FileInputStream("MS949.txt");
			InputStreamReader isr2 = new InputStreamReader(fis2,"MS949");
			
			int data2 = -1;
			
			while((data2 = isr2.read()) != -1){
				System.out.print((char)data2);	
			}
			isr2.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
