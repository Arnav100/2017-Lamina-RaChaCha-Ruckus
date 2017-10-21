
package org.usfirst.frc.team4930.robot.autonomous;

import org.usfirst.frc.team4930.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Move using speed and time (dead reckoning)
 */
public class GoStraight extends Command
{
  public double speed;
  public double seconds;

  public GoStraight(double s, double sec) {
    speed = s;
    seconds = sec;
    requires(Robot.driveTrain);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.driveTrain.auto(speed, speed);
  }

  protected boolean isFinished() {
    return seconds <= timeSinceInitialized();
  }

  protected void end() {
    Robot.driveTrain.stop();
  }

  protected void interrupted() {
    end();
  }
}