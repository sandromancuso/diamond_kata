package com.codurance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.apache.commons.lang.StringUtils.repeat;

public class Diamond {

	public static final char START_LETTER = 'A';

	public static String[] upTo(char stopLetter) {
		int letters_interval = stopLetter - START_LETTER;

		List<String> rows = new ArrayList<>();

		for (int i = 0; i <= letters_interval; i++) {
			char currentLetter = (char)(START_LETTER + i);
			String row = dashes(stopLetter - currentLetter) +
						currentLetter +
						innerDashes(currentLetter - START_LETTER);

			if (i > 0) row += currentLetter;

			row += dashes(stopLetter - currentLetter);

			rows.add(row);
		}

		List<String> mirroredRows = new ArrayList<>(rows);
		Collections.reverse(mirroredRows);
		mirroredRows.remove(0);
		rows.addAll(mirroredRows);

		return rows.toArray(new String[rows.size()]);
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
