package com.Masai;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Qus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileReader fr=new FileReader("C:\\Users\\LENOVO\\Desktop\\JAVA\\abc.txt");
			BufferedReader br=new BufferedReader(fr);
			String line=br.readLine();
			while(line != null){
			System.out.println(line);
			line=br.readLine();
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


