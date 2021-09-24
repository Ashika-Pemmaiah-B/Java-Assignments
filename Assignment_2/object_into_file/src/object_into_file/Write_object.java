package object_into_file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Write_object 
{
	public static void main(String args[]) throws IOException 
	{
		Student s = new Student();
		s.setName("Rob");
		s.setRoll_num(22);
		FileOutputStream fos = new FileOutputStream(new File("sample_file.txt"));
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
		fos.close();
		oos.close();
		System.out.println("Done!");
	}
}


