package com.webapp.dumplingapp.pages;

import com.dumpling.core.Dumpling;
import com.dumpling.core.DumplingService;
import org.apache.tapestry5.annotations.Service;

import java.util.Date;
import java.util.List;

/**
 * Start page of application dumplingapp.
 */
public class Index
{

	public Date getCurrentTime() 
	{ 
		return new Date(); 
	}

    public List<Dumpling> getDumplings() {
        return new DumplingService().findAll();
    }
}
