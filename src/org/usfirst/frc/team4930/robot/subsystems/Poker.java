package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Poker extends Subsystem
{
  public void initDefaultCommand() {}

  public void out() {
    RobotMap.solenoid2.set(true);
  }

  public void in() {
    RobotMap.solenoid2.set(false);
  }
}
