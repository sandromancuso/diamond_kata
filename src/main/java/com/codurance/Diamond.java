package com.codurance;

public class Diamond {


	public static final String START_LETTER = "A";

	public static String upTo(String letter) {
		if ("C".equals(letter)) {
			return "--" + START_LETTER + "--";
		}
		if ("B".equals(letter)) {
			return "-" + START_LETTER + "-";
		}
		return START_LETTER;
	}
}
