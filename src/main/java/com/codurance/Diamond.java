package com.codurance;

import static org.apache.commons.lang.StringUtils.repeat;

public class Diamond {

	public static final char START_LETTER = 'A';

	public static String[] upTo(char stopLetter) {
		int distance_between_letters = stopLetter - START_LETTER;
		String[] diamond = new String[distance_between_letters + 1];
		String dashes = repeat("-", distance_between_letters);
		diamond[0] = dashes + START_LETTER + dashes;
		return diamond;
	}
}
