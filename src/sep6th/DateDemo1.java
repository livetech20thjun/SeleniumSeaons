package sep6th;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

	public static void main(String[] args) {
		
		Date d=new Date();
		
		System.out.println(d);
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String date=simpleDateFormat.format(new Date());
		
		date=date.replace(":", "-");
		
		System.out.println(date);

	}

}
