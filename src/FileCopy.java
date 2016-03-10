import java.io.FileInputStream;
import java.io.FileOutputStream;

//03.10(8)

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("pic.jpg");
			FileOutputStream fos = new FileOutputStream("pic2.jpg");
			
			int data = -1;
			while((data = fis.read())!=-1){
				fos.write(data);
			}
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
