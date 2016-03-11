import java.io.BufferedReader;
import java.io.FileReader;

// 03.11 (1)

public class BufferedReaderTest {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("./src/BufferedReaderTest.java");
			BufferedReader br = new BufferedReader(fr);
			
			String line = null;
			int index = 1;
			
			while((line = br.readLine()) != null){
				System.out.println(index+":"+line);
				index++;
			}
			
			br.close();
			fr.close();
			// 맨 앞에 있는 보조 스트림을 먼저 닫으면 다 닫힌다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
