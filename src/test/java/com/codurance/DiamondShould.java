package com.codurance;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DiamondShould {

	@Test public void
	create_diamond_with_single_row_A() {
		String[] diamond = Diamond.upTo('A');

		assertThat(diamond[0], is("A"));
	}

	@Test public void
	have_one_dash_on_each_side_of_A_when_up_to_B() {
		String[] diamond = Diamond.upTo('B');

		assertThat(diamond[0], is("-A-"));
	}

	@Test public void
	have_two_dashes_on_each_side_of_A_when_up_to_C() {
		String[] diamond = Diamond.upTo('C');

		assertThat(diamond[0], is("--A--"));
	}

	@Test public void
	have_two_rows_when_stop_letter_is_B() {
		String[] diamond = Diamond.upTo('B');
		assertThat(diamond.length, is(2));
	}

	@Test public void
	have_B_in_the_second_row() {
		String[] diamond = Diamond.upTo('B');

	    assertThat(diamond[1], is("B-B"));
	}

	@Test public void
	have_C_in_the_third_row() {
		String[] diamond = Diamond.upTo('C');

	    assertThat(diamond[2], is("C---C"));
	}

	@Test public void
	have_D_in_the_fourth_row() {
		String[] diamond = Diamond.upTo('D');

	    assertThat(diamond[3], is("D-----D"));
	}

	@Test public void
	have_B_row_when_stop_letter_is_C() {
		String[] diamond = Diamond.upTo('C');

		assertThat(diamond[1], is("-B-B-"));
	}

	@Test public void
	have_B_row_when_stop_letter_is_D() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond[1], is("--B-B--"));
	}

	@Test public void
	have_C_row_when_stop_letter_is_D() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond[2], is("-C---C-"));
	}

	@Test public void
	have_rows_from_A_to_D() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond[0], is("---A---"));
		assertThat(diamond[1], is("--B-B--"));
		assertThat(diamond[2], is("-C---C-"));
		assertThat(diamond[3], is("D-----D"));
	}

	@Ignore
	@Test public void
	have_mirrored_rows_at_the_bottom() {
		String[] diamond = Diamond.upTo('D');

		assertThat(diamond[0], is("---A---"));
		assertThat(diamond[1], is("--B-B--"));
		assertThat(diamond[2], is("-C---C-"));
		assertThat(diamond[3], is("D-----D"));
		assertThat(diamond[4], is("-C---C-"));
		assertThat(diamond[5], is("--B-B--"));
		assertThat(diamond[6], is("---A---"));
	}

}