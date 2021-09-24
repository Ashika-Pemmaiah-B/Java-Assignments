package com.epsilon.copy_dir;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Dir_copy {
	public static void main(String args[]) throws IOException
	{
		File src = new File("demo_dir");
		File dest = new File("copy_demo_dir");
		FileUtils.copyDirectory(src, dest);
		System.out.println("Contents of source directory copied at destination directory");
	}
}
