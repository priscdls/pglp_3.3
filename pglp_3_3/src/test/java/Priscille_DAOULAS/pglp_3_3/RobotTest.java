package Priscille_DAOULAS.pglp_3_3;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class RobotTest {

	@Test
	public void test()
	{
		ArrayList<Robot> Robots = new ArrayList<Robot>();
		Robots.add(new RobotType1(20));
		Robots.add(new RobotType2(20));
		
		for(int i = 0; i<Robots.size(); i++)
		{
			System.out.println("Position robot de type "+(i+1)+" : "+ Robots.get(i).position);
		}
	}

}
