package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
File csvfile=new File("C:\\Users\\DELL\\AppData\\Local\\Packages\\microsoft.windowscommunicationsapps_8wekyb3d8bbwe\\LocalState\\Files\\S0\\9\\cm29JAN2020bhav[374].csv");

	BufferedReader br=new BufferedReader(new FileReader(csvfile));
	String line="";
	
	try {
		while((line=br.readLine()) != null) 
		{
			String[] count=line.split(" ,");
			System.out.println(count[0]+" "+count[1]+" "+count[2]+" "+count[3]+" "+count[4]+" "+count[5]+" "+count[6]+count[7]+" "+count[8]+" "+count[9]+count[10]+" "+count[11]+" "+count[12]);
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	


	}

}
