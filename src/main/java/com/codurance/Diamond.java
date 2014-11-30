package com.codurance;

import static org.apache.commons.lang.StringUtils.repeat;

public class Diamond {

	public static final char START_LETTER = 'A';

	public static String[] upTo(char stopLetter) {
		int letters_interval = stopLetter - START_LETTER;

		String[] diamond = new String[letters_interval + 1];

		diamond[0] = firstRow(letters_interval);

		if (letters_interval > 0) {
			String dashes = dashes((letters_interval * 2) - 1);
			diamond[letters_interval] = stopLetter + dashes + stopLetter;
		}
		return diamond;
	}

	private static String firstRow(int letters_interval) {
		String dashes = dashes(letters_interval);
		return dashes + START_LETTER + dashes;
	}

	private static String dashes(int number) {
		return repeat("-", number);
	}
}
