package com.Masai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Qus2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr;
		try {
			fr = new FileReader("C:\\Users\\LENOVO\\Desktop\\JAVA\\abc.txt");
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line != null){
			System.out.println(line);
			line=br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
