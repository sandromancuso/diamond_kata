package com.codurance;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.reverse;
import static org.apache.commons.lang.StringUtils.repeat;

public class Diamond {

	public static final char START_LETTER = 'A';

	public static String[] upTo(char stopLetter) {
		List<String> rows = createRows(stopLetter);
		List<String> mirroredRows = mirrorRows(rows);
		rows.addAll(mirroredRows);

		return rows.toArray(new String[rows.size()]);
	}

	private static List<String> mirrorRows(List<String> rows) {
		List<String> mirroredRows = new ArrayList<>(rows);
		reverse(mirroredRows);
		mirroredRows.remove(0);
		return mirroredRows;
	}

	private static List<String> createRows(char stopLetter) {
		List<String> rows = new ArrayList<>();
		int letterInterval = stopLetter - START_LETTER;
		for (int letterIndex = 0; letterIndex <= letterInterval; letterIndex++) {
			rows.add(createRow(stopLetter, letterIndex));
		}
		return rows;
	}

	private static String createRow(char stopLetter, int letterIndex) {
		char currentLetter = (char)(START_LETTER + letterIndex);
		String outerDashes = dashes(stopLetter - currentLetter);

		String row = outerDashes + currentLetter + innerDashes(currentLetter);
		if (letterIndex > 0) row += currentLetter;
		row += outerDashes;

		return row;
	}

	private static String innerDashes(int currentLetter) {
		int lettersInterval = currentLetter - START_LETTER;
		return dashes((lettersInterval * 2) - 1);
	}

	private static String dashes(int number) {
		return repeat("-", number);
	}

}
