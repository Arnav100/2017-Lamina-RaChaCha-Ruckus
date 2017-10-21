package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class LiftDown extends Command
{
  public LiftDown() {
    requires(Robot.lifter);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.lifter.down();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
