package org.usfirst.frc.team4930.robot.subsystems;

import org.usfirst.frc.team4930.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Lifter extends Subsystem
{
  public void initDefaultCommand() {}

  public void down() {
    RobotMap.solenoid3.set(true);
  }

  public void up() {
    RobotMap.solenoid3.set(false);
  }
}
