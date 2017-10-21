package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class PokeIn extends Command
{
  public PokeIn() {
    requires(Robot.poker);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.poker.in();
  }

  protected boolean isFinished() {
    return true;
  }

  protected void end() {}

  protected void interrupted() {
    end();
  }
}
