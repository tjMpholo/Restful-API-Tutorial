package com.practicaljava.lesson34;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("resources")
public class StockQuoteApplication extends Application{

	@Override
	public Set<Class<?>> getClasses() {
		// TODO Auto-generated method stub
		return null;
	}

}
