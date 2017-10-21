package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class LiftUp extends Command
{
  public LiftUp() {
    requires(Robot.lifter);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.lifter.up();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
