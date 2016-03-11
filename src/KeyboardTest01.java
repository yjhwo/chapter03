import java.io.BufferedReader;
import java.io.InputStreamReader;

// 03.11 (3)

public class KeyboardTest01 {

	public static void main(String[] args) {
		
		try {
			
			InputStreamReader isr = new InputStreamReader(System.in,"UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			String line;
			
			// 파일 끝: Ctrl+Z
			while((line = br.readLine()) != null){
				System.out.print(line);	
			}
			
			br.close();	// 보조 스트림을 닫는다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
