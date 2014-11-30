package com.codurance;

import static java.lang.String.valueOf;

public class Diamond {


	public static final char START_LETTER = 'A';

	public static String upTo(char letter) {
		if ('C' == letter) {
			return "--" + START_LETTER + "--";
		}
		if ('B' == letter) {
			return "-" + START_LETTER + "-";
		}
		return valueOf(START_LETTER);
	}
}
