import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
//03.11 (4)
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		try {
			File file = new File("phone.txt");
			
			if(file.exists() == false){
				System.out.println("파일이 존재하지 않습니다.");
				return ;
			}
			
			System.out.println("***파일 정보***");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length()+"Bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss").format(new Date(file.lastModified())));	// 1970년대 부터의 초(sec) 
			
			System.out.println("***전화번호 리스트***");
			
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);

			String line;

			// 파일 끝: Ctrl+Z
			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line,"\t ");
				int index=1;
				while(st.hasMoreTokens()){
					String token = st.nextToken();
					if(index==1){
						System.out.print("이름:"+token);
					}else if(index==2){
						System.out.print("\t\t전화번호:"+token);
					}else{
						System.out.print("-"+token);
					}
					
					index++;
				}
				System.out.println();
				
			}

			br.close(); 

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
