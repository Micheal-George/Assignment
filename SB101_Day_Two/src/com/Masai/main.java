package com.Masai;

import java.io.FileWriter;
import java.io.IOException;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\Desktop\\JAVA\\abc.txt");
		fw.write(100);//d will be added
		fw.write("ramesh\nwelcome");
		fw.write("\n");
		fw.write("india");
		fw.write("\n");
		char ch[]={'a','b','c'};
		fw.write(ch);
		fw.flush();
		fw.close();
		System.out.println("done");

	}

}
