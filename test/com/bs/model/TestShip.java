package com.bs.model;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class TestShip {

	@Test
	public void testConstructor() {
		Ship ts = new Ship(5,5,'H',5);
		
		Assert.assertArrayEquals( "StartCell FAIL", new int [] {5,5}, ts.getStartCell() );
	    Assert.assertEquals( "HitPoints FAIL", ts.getHitPoints().contains(Boolean.TRUE), false );		
		
		//fail("Not yet implemented");
	}
	
	@Test
	public void testSink() {
		Ship ts = new Ship(5,5,'H',5);
		
		Assert.assertTrue("isAlive FAIL after construcor", ts.isAlive());
		
		ts.setHitPoints(new ArrayList <Boolean>() {{
			add(false);
			add(false);
			add(true);
			add(false);
			add(false);
		}});
			
		Assert.assertTrue("isAlive FAIL [F F T ] test", ts.isAlive());
	}

}
