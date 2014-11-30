package com.codurance;

import static org.apache.commons.lang.StringUtils.repeat;

public class Diamond {

	public static final char START_LETTER = 'A';

	public static String[] upTo(char stopLetter) {
		int letters_interval = stopLetter - START_LETTER;

		String[] diamond = new String[letters_interval + 1];

		diamond[0] = firstRow(letters_interval);

		return diamond;
	}

	private static String firstRow(int letters_interval) {
		String dashes = repeat("-", letters_interval);
		return dashes + START_LETTER + dashes;
	}
}
