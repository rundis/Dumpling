package com.dumpling.core;

import java.util.Arrays;
import java.util.List;

public class DumplingService {

    private static List<Dumpling> DEFAULT_DUMPLINGS = Arrays.asList(
			new Dumpling("Chicken Gnochi", "Cool shaped pasta with pieces of chicken inside"),
			new Dumpling("Apple dumpling", "Deep fried dough rampacked with mashed apples")
		);



	public List<Dumpling> findAll() {
		return DEFAULT_DUMPLINGS;
	}	
	
}