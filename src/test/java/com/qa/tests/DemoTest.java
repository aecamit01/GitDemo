package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum()
	{
		System.out.println("SUM");
		int a=10;
		int b=20;
		AssertJUnit.assertEquals(30, a+b);
	}
		
		@Test
		public void div()
		{
			System.out.println("DIV");
			System.out.println("DIV1");
			int a=10;
			int b=20;
			AssertJUnit.assertEquals(2, b/a);
		}
			
			@Test
			public void sub()
			{
				System.out.println("sub");
				int a=10;
				int b=20;
				AssertJUnit.assertEquals(10, b-a);
			}
				@Test
				public void multi()
				{
					System.out.println("multi");
					System.out.println("DIV1");
					System.out.println("DIV2");
					System.out.println("DIV3");
					System.out.println("DIV4");
					System.out.println("DIV5");
					System.out.println("DIV6");
					System.out.println("DIV6");
					System.out.println("DIV11");
					System.out.println("DIV10");
					
					int a=10;
					int b=20;
					AssertJUnit.assertEquals(200, a*b);
		
	}

}
