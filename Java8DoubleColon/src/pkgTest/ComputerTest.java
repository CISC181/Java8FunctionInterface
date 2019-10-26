package pkgTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.function.BiFunction;

import org.junit.jupiter.api.Test;
import pkgCore.Computer;
import pkgInterface.InterfaceComputer;
import pkgInterface.TriFunction;

class ComputerTest {

	@Test
	void TestNoArgumens()
	{
		InterfaceComputer c = Computer::new;
		Computer computer = c.create();		
	}
	
	@Test 
	void TestTwoArguments()
	{
		BiFunction<Integer, String, Computer> c4Function = Computer::new; 
		Computer c2 = c4Function.apply(2013, "white");
		assertEquals(2013, c2.getIyear());
		assertEquals("white",c2.getStrname());
		assertEquals(1,c2.getIqty());
	}
	
	@Test
	void TestThreeArguments() {
		
		TriFunction <Integer, String, Integer, Computer> c6Function = Computer::new;
		Computer c3 = c6Function.apply(2008, "black", 90);		
		assertEquals(2008, c3.getIyear());
		assertEquals("black",c3.getStrname());
		assertEquals(90,c3.getIqty());		
	}

	@Test
	void TestForEach() {
		Computer c1 = new Computer(2015, "white");
		Computer c2 = new Computer(2009, "black");
		Computer c3 = new Computer(2014, "black");
		Arrays.asList(c1, c2, c3).forEach(System.out::println);
	}
}
