package com.yedam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.jupiter.api.Test;

public class FileTest {

	@Test
	public void list() {
		File file = new File("C:\\temp");
		String[] list =file.list();
		for(int i=0; i< list.length; i++) {
			System.out.println(list[i]);
		}
	}
	
	@Test
	public void delete() {
		File file = new File("C:/temp/copy.jpg");
		file.renameTo(new File("C:/temp/복사.jpg"));
	}
	
	@Test
	public void copy() throws Exception {
	    FileInputStream fi = new FileInputStream(new File("C:/temp/복사.jpg"));
	    FileOutputStream fo = new FileOutputStream(new File("C:/temp", "복사2.jpg"));

	    int temp;  
	    while ((temp = fi.read()) != -1) {
	        fo.write(temp);
	    }

	    fi.close();
	    fo.close();
	}
}
