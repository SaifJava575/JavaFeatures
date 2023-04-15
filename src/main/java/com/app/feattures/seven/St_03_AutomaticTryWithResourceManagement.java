package com.app.feattures.seven;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class St_03_AutomaticTryWithResourceManagement {

	public static void tryWithResource() throws FileNotFoundException{
		try (BufferedReader src = new BufferedReader(new FileReader("D:\\SaifuddinWorkSpace\\CompressFile\\info.txt"));
				BufferedWriter dest = new BufferedWriter(new FileWriter("D:\\SaifuddinWorkSpace\\CompressFile\\info.txt"))) {
			String line="Hello Java Full Stack Developer" ;
			while ((line = src.readLine()) != null) {
				System.out.println(line);
				dest.write(line);
				dest.newLine();
			}
			System.out.println("Done");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		// src and dest automatically close.
		// No need for finally to explicitly close the resources.
	}

	public static void main(String[] args)throws FileNotFoundException {
       tryWithResource();
	}

}
