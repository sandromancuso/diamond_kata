package com.codurance;

import static org.apache.commons.lang.StringUtils.repeat;

public class Diamond {

	public static final char START_LETTER = 'A';

	public static String upTo(char letter) {
		int distance_between_letters = letter - START_LETTER;
		String dashes = repeat("-", distance_between_letters);
		return dashes + START_LETTER + dashes;
	}
}
