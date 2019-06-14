package com.revature.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	/*
	 * This is a scanner. While it is useful for taking user input, it is also
	 * useful for parsing strings, etc.
	 */
	public static Scanner s = new Scanner(System.in);
	/*
	 * FileWriters are not thread-safe. They write characters to files, etc.
	 */
	public static FileWriter fw = null;
	/*
	 * BufferedWriters are thread-safe. They write strings to files, etc.
	 */
	public static BufferedWriter bw = null;
	
	public static FileReader fr =null;
	
	public static BufferedReader br = null;
	
	public static final String fileName = "file.txt";

	public static void main(String[] args) {

		/*
		 * The File class is used to create a file (if it doesn't exist). We can then
		 * write and read data to/from this file.
		 */
		File f = new File(fileName);

		System.out.println("Please input your social security number: ");
		int x = s.nextInt();
		System.out.println("Please input your mother's maiden name: ");
		/*
		 * When you hit the "enter" key, that constitutes user input as well. As a
		 * result, the "enter" is stuck in the buffer, so you have to consume it
		 * somehow. In this case, we will choose to consume it by using the nextLine()
		 * method.
		 */
		s.nextLine();
		String str = s.nextLine();

		System.out.println("The user's social security number is: " + x);
		System.out.println("The user's mother's maiden name is: " + str);

		try {
			/*
			 * A FileWriter object takes a file as an argument and optionally a boolean
			 * value which specifies whether or not you want to append data to the end of
			 * the file.
			 */
			fw = new FileWriter(f, true);
			bw = new BufferedWriter(fw);
			bw.write(x + " " + str + "\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			/*
			 * Now we'll try reading that user data from the file.
			 * We'll do so by using a FileReader and BufferedReader.
			 * FileReaders read one character at a time while
			 * BufferedReaders read multiple characters at a time.
			 */
		}
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while(br.ready()) {
				System.out.println(br.readLine());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*
		 * Always close your streams, connections, etc!
		 */
		s.close();
	}
}
