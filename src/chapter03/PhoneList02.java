package chapter03;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//03.11 (5)
public class PhoneList02 {

	public static void main(String[] args) {
		
		try {
			File file = new File("phone.txt");
			if(file.exists() == false){
				System.out.println("파일이 존재하지 않습니다.");
				return ;
			}
			
			Scanner sc = new Scanner(file);
			
			System.out.println("***파일 정보***");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length()+"Bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss").format(new Date(file.lastModified())));	// 1970년대 부터의 초(sec) 
			
			System.out.println("***전화번호 리스트***");
			while(sc.hasNextLine()){
				String name = sc.next();
				int num01 = sc.nextInt();
				int num02 = sc.nextInt();
				int num03 = sc.nextInt();
				
				System.out.println("이름:"+name+"\t\t전화번호:"+num01+"-"+num02+"-"+num03);
				
			}
			
			sc.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
