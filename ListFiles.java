import java.io.*;
public class ListFiles{
	public static void showFiles(File f1,int depth){
		File[] files=f1.listFiles();
		
		for(File file:files){
			if(file.isDirectory()){
				String spaces="%"+(depth+file.getName().length())+ "s";
				String s=String.format(spaces, file.getName()); 
				System.out.println(s);
				
				showFiles(file,depth+4);
			}else if (file.isFile() ){
				String spaces="%"+(depth+file.getName().length())+ "s";
				String s=String.format(spaces, file.getName()); 
				System.out.println(s);
				
			}
		}
	}
	public static void main(String[] args) {
		try{
			File f1=new File(args[0]);
			if(!f1.exists()){
				throw new FileNotFoundException();
			}
			showFiles(f1,0);
		}catch(FileNotFoundException e){
			System.out.println("File Doesnot exist");
		}	
			
	}
}