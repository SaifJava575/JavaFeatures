package com.app.feattures.fourteen;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

record User(int id, String password) {
};

public class Ft_RecordsTest {
	
	private User user1 = new User(0, "UserOne");

	@Test
	public void givenRecord_whenObjInitialized_thenValuesCanBeFetchedWithGetters() {
	    assertEquals(0, user1.id());
	    assertEquals("UserOne", user1.password());
	}

	@Test
	public void whenRecord_thenToStringImplemented() {
	    assertTrue(user1.toString().contains("UserOne"));
	}

}
