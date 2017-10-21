package org.usfirst.frc.team4930.robot.commands;

import org.usfirst.frc.team4930.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class GearGadgetOpen extends Command
{
  public GearGadgetOpen() {
    requires(Robot.gearGadget);
  }

  protected void initialize() {}

  protected void execute() {
    Robot.gearGadget.open();
  }

  protected boolean isFinished() {
    return timeSinceInitialized() > 1.5;
  }

  protected void end() {
    new GearGadgetClose().start();
  }

  protected void interrupted() {
    end();
  }
}
