package com;

public class Passkey {
	
	
	private final String allCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()-=_+[];',./\\{}:\"<>?";
	private char[] allCharArray = allCharacters.toCharArray();
	private final String randomString = "U!LtWc2>*EhCuO1)68b,I'#m\"fF4^g$Q%A_N3BpDj?:nK/]&(osv=9w-Z[@YM0a;THq<Giey}X{k7xlPJVd5RzS+r.\\";
	private char[] randomCharArray = randomString.toCharArray();

	

	public String hash(String aString) {
		char[] working = aString.toCharArray();
		
			for (int i = 0; i < working.length; i++) {
				for (int b = 0; b < allCharArray.length; b++) {
					if (allCharArray[b] == working[i]) {
						working[i] = randomCharArray[i];
					}
				}
			}
		
		StringBuilder a = new StringBuilder();
		a.append(working);
		return a.toString();

	}

}
