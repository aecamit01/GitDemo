package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	
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
					int a=10;
					int b=20;
					AssertJUnit.assertEquals(200, a*b);
		
	}

}
