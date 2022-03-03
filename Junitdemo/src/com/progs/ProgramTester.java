package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProgramTester {
	
	@Test
	public void test1() 
	{
		try {
			int res=new Program1().solution("a#n90");
		}catch (BugException e) {
			assertEquals("Invaild Character",e.getMessage());
		}	
	}

	@Test
	public void test2() {
		try {
			int res=new Program1().solution("a123");
			assertEquals(6,res);
		}catch (BugException e) {
		fail();
	}
	}
		@Test
		public void test3() 
		{
			try {
				int res=new Program1().solution("alvin");
			}catch (BugException e) {
				assertEquals("Invaild Character",e.getMessage());
			}	
		}

	}

