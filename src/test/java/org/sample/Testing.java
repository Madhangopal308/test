package org.sample;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testing extends Baseclass{
	
	@After
	public void tc0()
	{
		System.out.println("method00");
	}
	
	@Test
	public void tc01()
	{
		System.out.println("method01");
	}
	@AfterClass
	public static void tc02()
	{
		System.out.println("method02");
	}
	@BeforeClass
	public static void tc03()
	{
	  browserlaunch("https://www.facebook.com/");
	}
	
	@Before
	public void tc04()
	{
		System.out.println("method04");
	}
	@Test
	public void tc05()
	{
		System.out.println("method05");
	}
	

}
