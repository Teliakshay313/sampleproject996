package com.progs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyProgramTest {

	@Test
	void testfindSum1() {
		MyProgram prog=new MyProgram();
		int actual=prog.findSum(10,5);
		assertEquals(15,actual);
	}
	@Test
	void testfindSum2() {
		MyProgram prog=new MyProgram();
		int actual=prog.findSum(-2,2);
		assertEquals(0,actual);
	}
	@Test
	void testfindSum3() {
		MyProgram prog=new MyProgram();
		int actual=prog.findSum(10,2);
		assertEquals(12,actual);
	}
	

}
