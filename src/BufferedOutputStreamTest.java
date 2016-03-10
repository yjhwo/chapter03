import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//03.10(10)

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("123.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos,5);
			
			for(int i='0'; i<'9'; i++){			
//			for(int i=48; i<57; i++){
//				fos.write(i);
				bos.write(i);
			}
			
			fos.close();
			bos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
	}

}
