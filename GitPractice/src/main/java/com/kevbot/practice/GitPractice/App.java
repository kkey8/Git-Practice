package com.kevbot.practice.GitPractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	File f = new File("howdy.txt");
    	try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write("Hello world");
			bw.newLine();
			bw.write("I think this worked!");
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println( "Hello World!" );
        System.out.println(2+5);
    }
}
