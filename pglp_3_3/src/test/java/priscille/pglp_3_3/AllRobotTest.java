package priscille.pglp_3_3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllRobotTest {
	
	@Test
	public void test() {
		AllRobot rb = new AllRobot();
		 assertTrue(rb.getList().isEmpty());
	}
	@Test
	public void testAvanceTous() {
		RobotType1 rb1 = new RobotType1();
		RobotType2 rb2 = new RobotType2(12);
		AllRobot Rbs = new AllRobot();
	    Rbs.add(rb1);
	    Rbs.add(rb2);
	    Rbs.avancerTous();
	    assertTrue(rb1.getPosition().getX() == 0 && rb1.getPosition().getY() == 5 && rb2.getPosition().getX() == 0 && rb2.getPosition().getY() == 12);
	}

}
