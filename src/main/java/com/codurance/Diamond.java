package com.codurance;

import java.util.List;

import static java.util.Arrays.asList;
import static org.apache.commons.lang.StringUtils.repeat;

public class Diamond {

	public static final char START_LETTER = 'A';

	public static String[] upTo(char stopLetter) {
		int letters_interval = stopLetter - START_LETTER;

		String[] diamond = new String[letters_interval + 1];

		diamond[0] = firstRow(letters_interval);

		for (int i = 1; i <= letters_interval; i++) {
			char currentLetter = (char)(START_LETTER + i);
			diamond[i] = dashes(stopLetter - currentLetter) +
					currentLetter +
					innerDashes(currentLetter - START_LETTER) +
					currentLetter +
					dashes(stopLetter - currentLetter);
		}

		return diamond;
	}

	private static String firstRow(int letters_interval) {
		String dashes = dashes(letters_interval);
		return dashes + START_LETTER + dashes;
	}

	private static String innerDashes(int letters_interval) {
		return dashes((letters_interval * 2) - 1);
	}

	private static String dashes(int number) {
		return repeat("-", number);
	}

	public static void main(String[] args) {
		List<String> diamondRows = asList(Diamond.upTo('D'));
		diamondRows.forEach(l -> System.out.println(l));
	}
}
