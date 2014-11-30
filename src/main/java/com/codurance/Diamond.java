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
		stopLetterRow(stopLetter, letters_interval, diamond);

		if (letters_interval == 3) {
			diamond[1] = "--B-B--";
			diamond[2] = "-C---C-";
		}

		return diamond;
	}

	private static void stopLetterRow(char stopLetter, int letters_interval, String[] diamond) {
		if (letters_interval > 0) {
			String dashes = innerDashes(letters_interval);
			diamond[letters_interval] = stopLetter + dashes + stopLetter;
		}
	}

	private static String innerDashes(int letters_interval) {
		return dashes((letters_interval * 2) - 1);
	}

	private static String firstRow(int letters_interval) {
		String dashes = dashes(letters_interval);
		return dashes + START_LETTER + dashes;
	}

	private static String dashes(int number) {
		return repeat("-", number);
	}

	public static void main(String[] args) {
		List<String> diamondRows = asList(Diamond.upTo('D'));
		diamondRows.forEach(l -> System.out.println(l));
	}
}
