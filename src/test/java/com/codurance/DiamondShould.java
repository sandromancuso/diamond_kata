package com.codurance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DiamondShould {

	@Test public void
	create_diamond_with_single_row_A() {
		String diamond = Diamond.upTo('A');

		assertThat(diamond, is("A"));
	}

	@Test public void
	have_one_dash_on_each_side_of_A_when_up_to_B() {
		String diamond = Diamond.upTo('B');

		assertThat(diamond, is("-A-"));
	}

	@Test public void
	have_two_dashes_on_each_side_of_A_when_up_to_C() {
		String diamond = Diamond.upTo('C');

		assertThat(diamond, is("--A--"));
	}

}