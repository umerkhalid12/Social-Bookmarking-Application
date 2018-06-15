package com.semanticsquare.io;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class IODemo {
	public static void applyEncoding() {
		System.out.println("\nInside applyEncoding ...");
		//System.out.println("Default Character Encoding: " + System.getProperty("file.encoding"));
		
		// Ensure Eclipse property is set as UTF8		
		printEncodingDetails("luke");
		printEncodingDetails("€"); // Euro (Reference: http://stackoverflow.com/questions/34922333/how-does-java-fit-a-3-byte-unicode-character-into-a-char-type)
		printEncodingDetails("\u1F602"); // Non-BMP Unicode Code Point ~ Tears of Joy Emoji (one of Smiley graphic symbol)      
	}	
	private static void printEncodingDetails(String symbol) {
		System.out.println("\nSymbol: " + symbol);
		try {
			System.out.println("ASCII: " + Arrays.toString(symbol.getBytes("US-ASCII")));
			System.out.println("ISO-8859-1: " + Arrays.toString(symbol.getBytes("ISO-8859-1")));
			System.out.println("UTF-8: " + Arrays.toString(symbol.getBytes("UTF-8")));
			System.out.println("UTF-16: " + Arrays.toString(symbol.getBytes("UTF-16")));
			System.out.println("UTF-16 BE: " + Arrays.toString(symbol.getBytes("UTF-16BE")));
			System.out.println("UTF-16 LE: " + Arrays.toString(symbol.getBytes("UTF-16LE")));
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}		
	}

	public static void main(String[] args) {
		applyEncoding();
	}
}