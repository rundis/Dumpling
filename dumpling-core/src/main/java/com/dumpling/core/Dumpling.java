package com.dumpling.core;


import com.dumling.util.StringUtil;

public class Dumpling {
	private final String name;
	private final String description;
	
	public Dumpling(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

    public String toString() {
        return StringUtil.concatDumplingStyle(name, description);
    }
}