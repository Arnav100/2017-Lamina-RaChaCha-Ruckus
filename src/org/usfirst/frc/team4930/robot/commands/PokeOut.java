package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class PokeOut extends Command
{
  public PokeOut() {
    requires(Robot.poker);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.poker.out();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
