package com.codurance;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DiamondShould {

	@Test public void
	create_diamond_with_single_row_A() {
		String[] diamond = Diamond.upTo('A');

		assertThat(diamond[0]).isEqualTo("A");
	}

	@Test public void
	have_one_dash_on_each_side_of_A_when_up_to_B() {
		String[] diamond = Diamond.upTo('B');

		assertThat(diamond[0]).isEqualTo("-A-");
	}

	@Test public void
	have_two_dashes_on_each_side_of_A_when_up_to_C() {
		String[] diamond = Diamond.upTo('C');

		assertThat(diamond[0]).isEqualTo("--A--");
	}

	@Test public void
	have_B_in_the_second_row() {
		String[] diamond = Diamond.upTo('B');

		assertThat(diamond[1]).isEqualTo("B-B");
	}

	@Test public void
	have_C_in_the_third_row() {
		String[] diamond = Diamond.upTo('C');

		assertThat(diamond[2]).isEqualTo("C---C");
	}

	@Test public void
	have_D_in_the_fourth_row() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond[3]).isEqualTo("D-----D");
	}

	@Test public void
	have_B_row_when_stop_letter_is_C() {
		String[] diamond = Diamond.upTo('C');

		assertThat(diamond[1]).isEqualTo("-B-B-");
	}

	@Test public void
	have_B_row_when_stop_letter_is_D() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond[1]).isEqualTo("--B-B--");
	}

	@Test public void
	have_C_row_when_stop_letter_is_D() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond[2]).isEqualTo("-C---C-");
	}

	@Test public void
	have_rows_from_A_to_D() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond).startsWith( //
				"---A---",                   //
				"--B-B--", //
				"-C---C-", //
				"D-----D");
	}

	@Test public void
	have_mirrored_rows_at_the_bottom() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond).containsExactly( //
				"---A---", //
				"--B-B--", //
				"-C---C-", //
				"D-----D", //
				"-C---C-", //
				"--B-B--", //
				"---A---");
	}

}