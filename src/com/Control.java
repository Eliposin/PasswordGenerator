package com;

import java.util.Scanner;
import java.util.Random;

public class Control {
	
	

	public static void main(String[] args) {
		Control a = new Control();
		a.run();

	}
	
	private void run(){
		Scanner newScanner = new Scanner(System.in);
		String word = "";
		String working;
		StringBuilder aStringBuilder = new StringBuilder();
		Random number  = new Random(System.currentTimeMillis());
		int numberOfPasses = number.nextInt(25);
		System.out.println("Enter words to be used as base for password generation: (enter to finish):");
		if(newScanner.hasNextLine()){
			aStringBuilder.append(newScanner.nextLine());
			while(aStringBuilder.indexOf(" ") !=  -1){
				aStringBuilder.deleteCharAt(aStringBuilder.indexOf(" "));
			}
		}
		word = aStringBuilder.toString();
		working = word;
		Passkey create = new Passkey();
		for(int i = 0; i < numberOfPasses; i++){
			working = create.hash(working);
		}
		System.out.println(working);
		newScanner.close();
	}

}
