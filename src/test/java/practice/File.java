package practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class File {
	
	public static void main(String[] args) {
		
		String filePath = System.getProperty("user.dir");
		
		System.out.println(filePath);
		
		System.out.println(new Date());
		
		String pattern = "yyyy-MM-dd HH:mm:ss";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String date = sdf.format(new Date());
		
		System.out.println(date);
	}

}
