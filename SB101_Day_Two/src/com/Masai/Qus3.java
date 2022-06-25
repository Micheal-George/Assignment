package com.Masai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Qus3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter path");
		String path= sc.next();
		
		System.out.println("Enter Character to search");
		char ch= sc.next().charAt(0);
		
File f=new File(path);
		FileReader fr=new FileReader(path);
		
		 int count=0;
		 char[] chr=new char[(int)f.length()];
		 fr.read(chr);
		 for(char c:chr){
			 if(ch==c)
				 count++;
		 
		 }
		 System.out.println(count);
	}

}
