package sep6th;

import java.io.File;

public class FolderDemo2 {

	public static void main(String[] args) {
		
		File folder1=new File(System.getProperty("user.dir")+"\\screenshots");
		
		
		folder1.mkdir();
		
		System.out.println("End of program..");

	}

}
