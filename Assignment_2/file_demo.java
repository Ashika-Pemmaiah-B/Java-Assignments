package java_training;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class file_demo 
{
	// 2. Delete a directory with all files contained in it
	static void del_item(File f)
	{
		for (File sub_file : f.listFiles()) 
			if(sub_file.isDirectory())
				del_item(sub_file);
			else
				sub_file.delete();
		f.delete();
	}
	
	
	public static void main(String[] args) 
	{
		try 
		{
			// 2. Delete a directory with all files contained in it
			File f = new File("sample_folder");
			del_item(f);
			System.out.println("Deleted!");
	
 			// 3. Creating a new file and making it read only
			File file = new File("sample2.txt");
	        	file.createNewFile();
	        	boolean x = file.setReadOnly();
	        	System.out.println("\nFile is read-only?: " + x);
	        
			// 4. Reading a file
			FileInputStream fin = new FileInputStream("sample1.txt");
			byte c[] = fin.readAllBytes();
			for (byte b : c)
				System.out.print((char) b);
			fin.close();
			
			// 5. Writing content into a file
			FileOutputStream fos = new FileOutputStream("C:\\Users\\ASHPEMMA\\Desktop\\sample.txt");
			String s = "Hello!\nHave a good day :)";
			byte b[] = s.getBytes();
			fos.write(b);
			System.out.println("File contents updated!");
			fos.close();

			// 7. Create files with extension .txt, .tex and then delete files of .tex extension
				// files creation
			File f1 = new File("prog_7/f1.txt");
	        	f1.createNewFile();
	        	File f2 = new File("prog_7/f2.tex");
	        	f2.createNewFile();
	        	System.out.println(".txt and .tex files created!");
	        	// .tex file deletion
			File dir = new File("prog_7");
	       		for (File y : dir.listFiles())
	            		if (y.getName().endsWith(".tex"))
	                		y.delete(); 
	        	System.out.println("All .tex files deleted!");

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
