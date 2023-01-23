package org.example;

import nl.jqno.equalsverifier.EqualsVerifier;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class AppTest
{
	@Test
	void test()
	{
		assertTrue(true);
	}

	@Test
	void addTwoNumbersReturnSum()
	{
		System.out.println(App.add(0, 0));
		System.out.println(App.add(1, 0));
		System.out.println(App.add(1, 1));
		System.out.println(App.add(2, 2));

		var result = App.add(1, 1);

		assertEquals(2, result);
	}

	@Test
	void givenOddNumberOddShouldReturnTrue()
	{
		assertTrue(App.odd(3));
	}


	@Test
	void givenEvenNumberOddShouldReturnFalse()
	{
		assertTrue(App.odd(2));
	}

	@Test
	void setNegativeNumberShouldThrowIllegalArgumentException()
	{
		App app = new App();

		assertThrows(IllegalArgumentException.class, () -> app.setK(-1));


	}

	@Test
	void equalsContractForApp(){
		EqualsVerifier.simple().forClass(App.class).verify();
	}
}