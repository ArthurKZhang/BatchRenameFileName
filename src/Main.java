import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.util.Scanner;


public class Main {
	public static void main(String[]args){
		//this program runs in windows
		System.out.println("******this program runs in windows******");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("input the garbish name into 2 parts");
		String garbishName = scanner.nextLine();
		System.out.println("input floder path like\"H:\\aa\\dd\\cc\"");
		String floderPath = scanner.nextLine();
		scanner.close();
		
		File floder = new File(floderPath);
		File[] files = floder.listFiles();
		String fileName;
		String newName;
		//传智播客_韩顺平_php从入门到精通 视频教程 第
		for(int i = 0; i<files.length; i++){
			File file = files[i];
			fileName = file.getName();
			if(fileName.contains(garbishName)&&file.isFile()){
				newName = fileName.substring(garbishName.length(), fileName.length());
				System.out.println("newName"+newName);
				String aaa = file.getParentFile().toString()+File.separator+newName;
				System.out.println(aaa);
				boolean isOK= file.renameTo(new File(aaa));
				System.out.println(isOK);
			}
		}
		
	}
}
