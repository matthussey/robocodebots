package mjhjd;
import java.awt.Color;

import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * MattHussey1 - a robot by (your name here)
 */
public class MattHussey1 extends Robot
{
	/**
	 * run: MattHussey1's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		setColors(Color.red, Color.black, Color.white); // body,gun,radar

		// Robot main loop
		while(true) {
			// 45 degrees is one turn
			//turnRadarRight(45);
			// Base turn - 10 - 0.75 * abs(velocity)
			//turnRight(10);
			// Gun turn 20
			turnGunRight(20);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		fire(2.0);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
	}	
}
