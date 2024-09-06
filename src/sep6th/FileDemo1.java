package sep6th;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:\\012Livetech\\jars\\abc.txt");
		
		f1.createNewFile();
		
		System.out.println("End of Program...");

	}

}
