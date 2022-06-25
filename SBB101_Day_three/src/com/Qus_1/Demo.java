package com.Qus_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Path p = Paths.get("abc.txt");
		String msg="Java developer at masai";
		
		try {
			Files.write(p, msg.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("done...");

		Path p1 = Paths.get("abc.txt");
		List<String> list;
		try {
			list = Files.readAllLines(p1);
			System.out.println("Reading from the file");
			for(String line:list) {
			System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
