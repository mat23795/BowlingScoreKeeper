package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestFrame {

	Frame p;
	
	@Before
	public void setUp(){
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionLessThanZero1() throws BowlingException {
		p = new Frame(0,-10);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionLessThanZero2() throws BowlingException{
		p = new Frame(-3,  1);
	}
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionLessThanZero3() throws BowlingException {
		p = new Frame(-3,-10);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionMoreThanTen1() throws BowlingException{
		p = new Frame(11,  1);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionMoreThanTen2() throws BowlingException{
		p = new Frame(5,  19);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionMoreThanTen3() throws BowlingException{
		p = new Frame(11,  30);
	}
	
	@Test (expected = BowlingException.class)
	public void testInitFrameExceptionScoreMoreThanTen() throws BowlingException{
		p = new Frame(9,  9);
	}
	
	@Test
	public void testScore() throws BowlingException{
		p = new Frame(8, 1);
		assert(p.score()==9);
	}
	
	@Test
	public void testIsStrikeTrue() throws BowlingException{
		p = new Frame(10, 0);
		assert(p.isStrike()==true);
	}
	
	@Test
	public void testIsStrikeFalse() throws BowlingException{
		p = new Frame(2, 6);
		assert(p.isStrike()==false);		
	}
	
	@Test
	public void testIsSpareTrue() throws BowlingException{
		p = new Frame(9, 1);
		assert(p.isSpare()==true);
	}
	
	@Test
	public void testIsSpareFalse() throws BowlingException{
		p = new Frame(2, 6);
		assert(p.isSpare()==false);		
	}	
}
