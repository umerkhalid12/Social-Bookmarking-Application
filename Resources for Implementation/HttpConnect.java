package com.semanticsquare.exceptions;

import java.io.FileNotFoundException;

public class HttpConnect {
	
	public static void send(int destination, String data, String partner) throws FileNotFoundException {
		System.out.println("\nInside send ...");
		if (destination == 0){
			throw new FileNotFoundException();
		}
		
		System.out.println("\nEnd of send ...");
	}
}
