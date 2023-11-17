package oct25th;

import java.io.File;

public class FolderDemo1 {

	public static void main(String[] args) {
		
		File folder=new File("D:\\java_selenium\\softwares\\day25");
		
		System.out.println(folder.mkdir());
		
		System.out.println("End of program");

	}

}
